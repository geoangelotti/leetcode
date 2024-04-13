import o.mg.isAnagram
import kotlin.test.Test
import kotlin.test.assertEquals

class `Valid Anagram Test` {
    @Test
    fun case1() {
        val result = isAnagram("anagram", "nagaram")
        assertEquals(result, true)
    }

    @Test
    fun case2() {
        val result = isAnagram("rat", "car")
        assertEquals(result, false)
    }

    @Test
    fun case3() {
        val result = isAnagram("a", "aa")
        assertEquals(result, false)
    }
}