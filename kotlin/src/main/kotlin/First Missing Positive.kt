package o.mg

fun firstMissingPositive(nums: IntArray): Int {
    val set = nums.toSet()
    var num = 1
    while (num in set) {
        num += 1
    }
    return num
}