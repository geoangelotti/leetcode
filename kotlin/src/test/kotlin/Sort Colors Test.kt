import o.mg.sortColors
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Sort Colors Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSortColors(input: IntArray, expected: IntArray) {
        sortColors(input)
        assertTrue(input.contentEquals(expected))
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(2, 0, 2, 1, 1, 0), intArrayOf(0, 0, 1, 1, 2, 2)),
                Arguments.of(intArrayOf(2, 0, 1), intArrayOf(0, 1, 2)),
            )
        }
    }
}