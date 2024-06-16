import o.mg.minIncrementForUnique
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Minimum Increment to Make Array Unique Test` {
    @Test
    fun case1() {
        val result = minIncrementForUnique(intArrayOf(1, 2, 2))
        assertEquals(1, result)
    }

    @Test
    fun case2() {
        val result = minIncrementForUnique(intArrayOf(3, 2, 1, 2, 1, 7))
        assertEquals(6, result)
    }
}