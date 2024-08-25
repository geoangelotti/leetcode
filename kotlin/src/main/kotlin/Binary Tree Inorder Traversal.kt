package o.mg

fun inorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) {
        return listOf<Int>()
    }
    val list1 = inorderTraversal(root.left).toMutableList()
    list1.add(root.`val`)
    val list2 = inorderTraversal(root.right)
    list1.addAll(list2)
    return list1
}