import o.mg.relativeSortArray
import kotlin.test.Test
import kotlin.test.assertEquals

class `Relative Sort Array Test` {
    @Test
    fun case1() {
        val result = relativeSortArray(intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19), intArrayOf(2, 1, 4, 3, 9, 6))
        assertEquals(intArrayOf(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19).toList(), result.toList())
    }

    @Test
    fun case2() {
        val result = relativeSortArray(intArrayOf(28, 6, 22, 8, 44, 17), intArrayOf(22, 28, 8, 6))
        assertEquals(intArrayOf(22, 28, 8, 6, 17, 44).toList(), result.toList())
    }
}