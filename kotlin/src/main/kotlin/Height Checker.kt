package o.mg

fun heightChecker(heights: IntArray): Int {
    val sorted = heights.sortedArray()
    return sorted.zip(heights).count { it.first != it.second }
}