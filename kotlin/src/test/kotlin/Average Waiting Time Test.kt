import o.mg.averageWaitingTime
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Average Waiting Time Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testAverageWaitingTime(customers: Array<IntArray>, expected: Double) {
        val result = averageWaitingTime(customers)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(4, 3)), 5.0),
                Arguments.of(arrayOf(intArrayOf(5, 2), intArrayOf(5, 4), intArrayOf(10, 3), intArrayOf(20, 1)), 3.25),
            )
        }
    }
}