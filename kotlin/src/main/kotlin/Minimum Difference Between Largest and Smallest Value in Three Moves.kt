package o.mg

import kotlin.math.min

fun minDifference(nums: IntArray): Int {
    if (nums.size <= 4)
        return 0
    nums.sort()
    var ans = nums[nums.size - 1] - nums[0]
    for (i in 0 until 4) {
        ans = min(ans, nums[nums.size - (3 - i) - 1] - nums[i])
    }
    return ans
}