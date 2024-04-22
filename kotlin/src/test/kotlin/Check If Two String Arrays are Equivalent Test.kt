import o.mg.arrayStringsAreEqual
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Check If Two String Arrays are Equivalent Test` {
    @Test
    fun case1() {
        val result = arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc"))
        assertTrue { result }
    }

    @Test
    fun case2() {
        val result = arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c"))
        assertFalse { result }
    }

    @Test
    fun case3() {
        val result = arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg"))
        assertTrue { result }
    }
}