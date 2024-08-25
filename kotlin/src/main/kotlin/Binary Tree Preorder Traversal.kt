package o.mg

fun preorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) {
        return listOf<Int>()
    }
    val list = mutableListOf<Int>(root.`val`)
    list.addAll(preorderTraversal(root.left))
    list.addAll(preorderTraversal(root.right))
    return list
}