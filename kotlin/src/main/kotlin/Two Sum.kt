package o.mg

fun twoSum(nums: IntArray, target: Int): IntArray {
    val res = IntArray(2)
    for (i in nums.withIndex()) {
        for (y in nums.withIndex()) {
            if ((i.value + y.value == target) && (i.index != y.index)) {
                res[0] = i.index
                res[1] = y.index
                return res
            }
        }
    }
    return res
}