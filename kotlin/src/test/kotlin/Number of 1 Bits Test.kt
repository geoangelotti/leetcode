import o.mg.hammingWeight
import kotlin.test.Test
import kotlin.test.assertEquals

class `Number of 1 Bits Test` {
    @Test
    fun case1() {
        val result = hammingWeight(11)
        assertEquals(result, 3)
    }

    @Test
    fun case2() {
        val result = hammingWeight(128)
        assertEquals(result, 1)
    }

    @Test
    fun case3() {
        val result = hammingWeight(2147483645)
        assertEquals(result, 30)
    }
}