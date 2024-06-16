import o.mg.isPalindrome
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Valid Palindrome Test` {
    @Test
    fun case1() {
        val result = isPalindrome("A man, a plan, a canal: Panama")
        assertTrue { result }
    }

    @Test
    fun case2() {
        val result = isPalindrome("race a car")
        assertFalse { result }
    }

    @Test
    fun case3() {
        val result = isPalindrome(" ")
        assertTrue { result }
    }
}