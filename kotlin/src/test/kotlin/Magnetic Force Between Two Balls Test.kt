import o.mg.maxDistance
import kotlin.test.Test
import kotlin.test.assertEquals

class `Magnetic Force Between Two Balls Test` {
    @Test
    fun case1() {
        val result = maxDistance(intArrayOf(1, 2, 3, 4, 7), 3)
        assertEquals(3, result)
    }

    @Test
    fun case2() {
        val result = maxDistance(intArrayOf(5, 4, 3, 2, 1, 1000000000), 2)
        assertEquals(999999999, result)
    }
}