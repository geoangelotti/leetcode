package o.mg

fun sumOfSquares(nums: IntArray): Int {
    var sum = 0
    nums.forEachIndexed { i, num ->
        if (nums.size % (i + 1) == 0) sum += num * num
    }
    return sum
}