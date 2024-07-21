package o.mg

fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
    val nodes = mutableMapOf<Int, TreeNode>()
    val children = mutableSetOf<Int>()
    descriptions.forEach {
        nodes.put(it[0], TreeNode(it[0]))
        nodes.put(it[1], TreeNode(it[1]))
        children.add(it[1])
    }
    descriptions.forEach {
        val parent = nodes[it[0]]!!
        val child = nodes[it[1]]!!
        if (it[2] == 1) {
            parent.left = child
        } else {
            parent.right = child
        }
    }
    return nodes[nodes.keys.minus(children).first()]!!
}