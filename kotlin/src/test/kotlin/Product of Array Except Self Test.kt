import o.mg.productExceptSelf
import kotlin.test.Test
import kotlin.test.assertEquals

class `Product of Array Except Self Test` {
    @Test
    fun case1() {
        val result = productExceptSelf(intArrayOf(1, 2, 3, 4))
        assertEquals(arrayListOf(24, 12, 8, 6), result.toList())

    }

    @Test
    fun case2() {
        val result = productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
        assertEquals(arrayListOf(0, 0, 9, 0, 0), result.toList())
    }
}