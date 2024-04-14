import o.mg.findTheDifference
import kotlin.test.Test
import kotlin.test.assertEquals

class `Find the Difference Test` {
    @Test
    fun case1(){
        val result = findTheDifference("abcd", "abcde")
        assertEquals(result, 'e')
    }

    @Test
    fun case2(){
        val result = findTheDifference("", "t")
        assertEquals(result, 't')
    }
}