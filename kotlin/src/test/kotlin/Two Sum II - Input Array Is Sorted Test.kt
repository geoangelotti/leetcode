import o.mg.twoSumII
import kotlin.test.Test
import kotlin.test.assertEquals

class `Two Sum II - Input Array Is Sorted Test` {
    @Test
    fun case1(){
        val result = twoSumII(intArrayOf(2,7,11,15), 9)
        assertEquals(intArrayOf(1,2).toList(), result.toList())
    }

    @Test
    fun case2(){
        val result = twoSumII(intArrayOf(2,3,4), 6)
        assertEquals(intArrayOf(1,3).toList(), result.toList())
    }

    @Test
    fun case3(){
        val result = twoSumII(intArrayOf(-1,0), -1)
        assertEquals(intArrayOf(1,2).toList(), result.toList())
    }
}