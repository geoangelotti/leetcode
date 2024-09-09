package o.mg

import kotlin.math.max

fun rob(nums: IntArray): Int {
    var rob1 = 0
    var rob2 = 0
    nums.forEach {
        val temp = max(rob2, rob1 + it)
        rob1 = rob2
        rob2 = temp
    }
    return max(rob1, rob2)
}