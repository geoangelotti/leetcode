package o.mg

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return sortedArrayToBSTIndex(nums, 0, nums.size - 1)
}

fun sortedArrayToBSTIndex(nums: IntArray, left: Int, right: Int): TreeNode? {
    if (left > right) {
        return null
    }
    val half = (left + right) / 2
    val node = TreeNode(nums[half])
    node.left = sortedArrayToBSTIndex(nums, left, half - 1)
    node.right = sortedArrayToBSTIndex(nums, half + 1, right)
    return node
}