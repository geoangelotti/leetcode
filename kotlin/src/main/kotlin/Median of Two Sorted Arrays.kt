package o.mg

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val merged = mutableListOf<Int>()
    var i = 0
    var j = 0
    while (i < nums1.size && j < nums2.size) {
        if (nums1[i] < nums2[j]) {
            merged.add(nums1[i])
            i++
        } else {
            merged.add(nums2[j])
            j++
        }
    }
    while (i < nums1.size) {
        merged.add(nums1[i])
        i++
    }
    while (j < nums2.size) {
        merged.add(nums2[j])
        j++
    }
    return if (merged.size % 2 == 0) {
        (merged[merged.size / 2].toDouble() + merged[merged.size / 2 - 1].toDouble()) / 2
    } else merged[merged.size / 2].toDouble()
}