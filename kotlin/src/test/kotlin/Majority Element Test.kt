import o.mg.majorityElement
import kotlin.test.Test
import kotlin.test.assertEquals

class `Majority Element Test` {
    @Test
    fun case1() {
        val result = majorityElement(intArrayOf(3,2,3))
        assertEquals(3, result)
    }

    @Test
    fun case2() {
        val result = majorityElement(intArrayOf(2,2,1,1,1,2,2))
        assertEquals(2, result)
    }
}