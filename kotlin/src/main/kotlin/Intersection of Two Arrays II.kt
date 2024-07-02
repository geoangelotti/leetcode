package o.mg

fun intersectII(nums1: IntArray, nums2: IntArray): IntArray {
    val helper1 = IntArray(1001) { 0 }
    val helper2 = IntArray(1001) { 0 }
    nums1.forEach {
        helper1[it]++
    }
    nums2.forEach {
        helper2[it]++
    }
    val result = mutableListOf<Int>()
    for (i in 0 until 1001) {
        for (j in 0 until minOf(helper1[i], helper2[i])) {
            result.add(i)
        }
    }
    return result.toIntArray()
}