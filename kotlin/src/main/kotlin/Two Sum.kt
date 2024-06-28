package o.mg

fun twoSum(nums: IntArray, target: Int): IntArray {
    val valuesPositions = mutableMapOf<Int, Int>()
    for ((i, v) in nums.withIndex()) {
        val res = target - v
        val potentialIndex = valuesPositions[res]
        potentialIndex?.let {
            return intArrayOf(potentialIndex, i)
        }
        valuesPositions[v] = i
    }
    return intArrayOf()
}