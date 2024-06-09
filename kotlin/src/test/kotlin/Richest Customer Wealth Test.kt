import o.mg.maximumWealth
import kotlin.test.Test
import kotlin.test.assertEquals

class `Richest Customer Wealth Test` {
    @Test
    fun case1() {
        val result = maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)))
        assertEquals(6, result)
    }

    @Test
    fun case2() {
        val result = maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5)))
        assertEquals(10, result)
    }

    @Test
    fun case3() {
        val result = maximumWealth(arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5)))
        assertEquals(17, result)
    }
}