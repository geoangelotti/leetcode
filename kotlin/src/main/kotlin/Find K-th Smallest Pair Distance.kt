package o.mg

fun smallestDistancePair(nums: IntArray, k: Int): Int {
    nums.sort()
    var low = 0
    var high = 1_000_000
    while (low <= high) {
        val mid = low + (high - low) / 2
        var j = 0
        if (k > nums.indices.sumOf { i ->
                while (nums[j] + mid < nums[i]) j++
                i - j
            }) low = mid + 1 else high = mid - 1
    }
    return low
}