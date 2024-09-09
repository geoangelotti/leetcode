package o.mg

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun countPairs(root: TreeNode, distance: Int): Int {
    val leaves = HashSet<TreeNode>()
    val parents = HashMap<TreeNode, TreeNode>()
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val node = queue.pop()
        if (node.left == null && node.right == null) {
            leaves.add(node)
        }
        node.left?.let {
            queue.add(it)
            parents[it] = node
        }
        node.right?.let {
            queue.add(it)
            parents[it] = node
        }
    }
    var pairsCount = 0
    for (leaf in leaves) {
        val queue = LinkedList<Pair<TreeNode?, TreeNode>>()
        queue.add(null to leaf)
        var stepsCount = 0
        while (queue.isNotEmpty() && stepsCount <= distance) {
            repeat(queue.size) {
                val (from, node) = queue.pop()
                if (node != leaf && leaves.contains(node)) {
                    pairsCount++
                }
                parents[node]?.takeIf { it != from }?.let { queue.add(node to it) }
                node.left?.takeIf { it != from }?.let { queue.add(node to it) }
                node.right?.takeIf { it != from }?.let { queue.add(node to it) }
            }
            stepsCount++
        }
    }
    return pairsCount / 2
}