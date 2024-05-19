import o.mg.search
import kotlin.test.Test
import kotlin.test.assertEquals

class `Binary Search Test` {
    @Test
    fun case1() {
        val result = search(intArrayOf(-1,0,3,5,9,12), 9)
        assertEquals(4, result)
    }

    @Test
    fun case2() {
        val result = search(intArrayOf(-1,0,3,5,9,12), 2)
        assertEquals(-1, result)
    }
}