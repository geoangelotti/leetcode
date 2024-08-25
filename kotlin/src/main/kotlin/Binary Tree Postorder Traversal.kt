package o.mg

fun postorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) {
        return listOf()
    }
    val list1 = postorderTraversal(root.left).toMutableList()
    val list2 = postorderTraversal(root.right)
    list1.addAll(list2)
    list1.add(root.`val`)
    return list1
}