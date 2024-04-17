package o.mg

fun productExceptSelf(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    for (i in nums.indices) {
        var prod = 1
        for (j in nums.indices) {
            if (i!=j) {
                prod *= nums[j]
            }
        }
        res[i] = prod
    }
    return res
}