package o.mg

fun sumOfLeftLeaves(root: TreeNode?): Int {
    var acc = 0
    val stack = ArrayDeque<Pair<TreeNode?, Boolean>>()
    stack.addLast(Pair(root, false))
    while (stack.isNotEmpty()) {
        val (node, isLeft) = stack.removeFirst()
        if (node != null && node.left == null && isLeft) {
            acc += node.`val`
        }
        node?.left?.let { stack.addLast(Pair(it, true)) }
        node?.right?.let { stack.addLast(Pair(it, false)) }
    }
    return acc
}
