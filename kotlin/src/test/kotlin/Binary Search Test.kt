import o.mg.search
import kotlin.test.Test
import kotlin.test.assertEquals

class `Binary Search Test` {
    @Test
    fun case1() {
        val result = search(intArrayOf(-1,0,3,5,9,12), 9)
        assertEquals(result, 4)
    }

    @Test
    fun case2() {
        val result = search(intArrayOf(-1,0,3,5,9,12), 2)
        assertEquals(result, -1)
    }
}