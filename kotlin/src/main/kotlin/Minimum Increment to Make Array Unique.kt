package o.mg

fun minIncrementForUnique(nums: IntArray): Int {
    nums.sort()
    var steps = 0
    for (i in 1..<nums.size) {
        if (nums[i] <= nums[i - 1]) {
            steps += nums[i - 1] - nums[i] + 1
            nums[i] = nums[i - 1] + 1
        }
    }
    return steps
}