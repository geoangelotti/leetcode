import o.mg.groupAnagrams
import kotlin.test.Test
import kotlin.test.assertEquals

class `Group Anagrams Test` {
    @Test
    fun case1() {
        val result = groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        assertEquals(listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat")), result)
    }

    @Test
    fun case2() {
        val result = groupAnagrams(arrayOf(""))
        assertEquals(listOf(listOf("")), result)
    }

    @Test
    fun case3() {
        val result = groupAnagrams(arrayOf("a"))
        assertEquals(listOf(listOf("a")), result)
    }
}