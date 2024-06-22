package o.mg

fun sumOfSquares(nums: IntArray): Int {
    return nums.withIndex().filter { (i, _) -> (nums.size % (i + 1) == 0) }.sumOf { (_, num) -> num * num }
}