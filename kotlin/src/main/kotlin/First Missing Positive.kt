package o.mg

fun firstMissingPositive(nums: IntArray): Int {
    val exists = BooleanArray(nums.size + 1)
    nums.forEach {
        if (it > 0 && it <= nums.size) {
            exists[it] = true
        }
    }
    for (i in 1..nums.size) {
        if (!exists[i]) {
            return i
        }
    }
    return nums.size + 1
}