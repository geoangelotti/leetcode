import o.mg.firstMissingPositive
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `First Missing Positive Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testFirstPositiveNumber(input: IntArray, expected: Int) {
        val result = firstMissingPositive(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 2, 0), 3),
                Arguments.of(intArrayOf(3, 4, -1, 1), 2),
                Arguments.of(intArrayOf(7, 8, 9, 11, 12), 1),
            )
        }
    }
}