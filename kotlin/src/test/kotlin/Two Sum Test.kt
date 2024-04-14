import o.mg.twoSum
import kotlin.test.Test
import kotlin.test.assertEquals

class `Two Sum Test` {
    @Test
    fun case1() {
        val result = twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertEquals(listOf(0, 1), result.toList())
    }

    @Test
    fun case2() {
        val result = twoSum(intArrayOf(3, 2, 4), 6)
        assertEquals(listOf(1, 2), result.toList())
    }

    @Test
    fun case3() {
        val result = twoSum(intArrayOf(3, 3), 6)
        assertEquals(listOf(0, 1), result.toList())
    }
}