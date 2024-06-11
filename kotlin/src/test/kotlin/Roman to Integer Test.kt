import o.mg.romanToInt
import kotlin.test.Test
import kotlin.test.assertEquals

class `Roman to Integer Test` {
    @Test
    fun case1() {
        val result = romanToInt("III")
        assertEquals(3, result)
    }

    @Test
    fun case2() {
        val result = romanToInt("LVIII")
        assertEquals(58, result)
    }

    @Test
    fun case3() {
        val result = romanToInt("MCMXCIV")
        assertEquals(1994, result)
    }
}