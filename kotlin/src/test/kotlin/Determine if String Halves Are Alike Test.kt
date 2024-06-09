import o.mg.halvesAreAlike
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Determine if String Halves Are Alike Test` {
    @Test
    fun case1() {
        val result = halvesAreAlike("book")
        assertTrue { result }
    }

    @Test
    fun case2() {
        val result = halvesAreAlike("textbook")
        assertFalse { result }
    }
}