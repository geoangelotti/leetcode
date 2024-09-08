import o.mg.maxProfitAssignment
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Most Profit Assigning Work Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMaxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray, expected: Int) {
        val result = maxProfitAssignment(difficulty, profit, worker)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(2, 4, 6, 8, 10), intArrayOf(10, 20, 30, 40, 50), intArrayOf(4, 5, 6, 7), 100),
                Arguments.of(intArrayOf(85, 47, 57), intArrayOf(24, 66, 99), intArrayOf(40, 25, 25), 0),
            )
        }
    }
}