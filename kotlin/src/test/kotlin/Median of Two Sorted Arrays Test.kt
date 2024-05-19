import o.mg.findMedianSortedArrays
import kotlin.test.Test
import kotlin.test.assertEquals

class `Median of Two Sorted Arrays Test` {
    @Test
    fun case1() {
        val result = findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
        assertEquals(result, 2.0)
    }

    @Test
    fun case2() {
        val result = findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))
        assertEquals(result, 2.5)
    }
}