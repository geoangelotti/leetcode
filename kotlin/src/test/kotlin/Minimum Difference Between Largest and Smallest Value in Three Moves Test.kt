import o.mg.minDifference
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class `Minimum Difference Between Largest and Smallest Value in Three Moves Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMinDifference(input: IntArray, expected: Int) {
        val result = minDifference(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(5, 3, 2, 4), 0),
                Arguments.of(intArrayOf(1, 5, 0, 10, 14), 1),
                Arguments.of(intArrayOf(3, 100, 20), 0),
            )
        }
    }
}