package o.mg

fun sortColors(nums: IntArray): Unit {
    val counter = IntArray(3) { 0 }
    nums.forEach { counter[it] += 1 }
    var rollingStart = 0
    for (i in 0..<counter[0]) {
        nums[i + rollingStart] = 0
    }
    rollingStart += counter[0]
    for (i in 0..<counter[1]) {
        nums[i + rollingStart] = 1
    }
    rollingStart += counter[1]
    for (i in 0..<counter[2]) {
        nums[i + rollingStart] = 2
    }
    rollingStart += counter[2]
}