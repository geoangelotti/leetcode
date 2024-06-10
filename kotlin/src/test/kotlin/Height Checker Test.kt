import o.mg.heightChecker
import kotlin.test.Test
import kotlin.test.assertEquals

class `Height Checker Test` {
    @Test
    fun case1() {
        val result = heightChecker(intArrayOf(1,1,4,2,1,3))
        assertEquals(3, result)
    }

    @Test
    fun case2() {
        val result = heightChecker(intArrayOf(5,1,2,3,4))
        assertEquals(5, result)
    }

    @Test
    fun case3() {
        val result = heightChecker(intArrayOf(1,2,3,4,5))
        assertEquals(0, result)
    }
}