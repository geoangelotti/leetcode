import o.mg.`Detect Squares`
import kotlin.test.Test
import kotlin.test.assertEquals

class `Detect Squares Test` {
    @Test
    fun test() {
        val detectSquares = `Detect Squares`()
        detectSquares.add(intArrayOf(3, 10))
        detectSquares.add(intArrayOf(11, 2))
        detectSquares.add(intArrayOf(3, 2))
        var result = detectSquares.count(intArrayOf(11, 10))
        assertEquals(1, result)
        result = detectSquares.count(intArrayOf(14, 8))
        assertEquals(0, result)
        detectSquares.add(intArrayOf(11, 2))
        result = detectSquares.count(intArrayOf(11, 10))
        assertEquals(2, result)
    }
}