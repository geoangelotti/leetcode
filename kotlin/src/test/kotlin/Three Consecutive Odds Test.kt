import o.mg.threeConsecutiveOdds
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Three Consecutive Odds Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testThreeConsecutiveOdds(input: IntArray, expected: Boolean) {
        val result = threeConsecutiveOdds(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(2, 6, 4, 1), false),
                Arguments.of(intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12), true),
                Arguments.of(intArrayOf(1, 1, 1), true),
            )
        }
    }
}