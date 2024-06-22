import o.mg.sumOfSquares
import kotlin.test.Test
import kotlin.test.assertEquals

class `Sum of Squares of Special Elements Test` {
    @Test
    fun case1() {
        val result = sumOfSquares(intArrayOf(1, 2, 3, 4))
        assertEquals(21, result)
    }

    @Test
    fun case2() {
        val result = sumOfSquares(intArrayOf(2, 7, 1, 19, 18, 3))
        assertEquals(63, result)
    }
}