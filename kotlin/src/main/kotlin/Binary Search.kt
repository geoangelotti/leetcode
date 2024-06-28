package o.mg

fun search(nums: IntArray, target: Int): Int {
    var index = -1
    var start = 0
    var end = nums.size - 1
    while (start <= end) {
        val mid = (start + end) / 2
        if (nums[mid] == target) {
            index = mid
            break
        }
        if (nums[mid] < target) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    return index
}