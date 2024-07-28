import o.mg.sortJumbled
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Sort the Jumbled Numbers Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSortJumbled(mapping: IntArray, nums: IntArray, expected: IntArray) {
        val result = sortJumbled(mapping, nums)
        assertTrue(expected.contentEquals(result))
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    intArrayOf(8, 9, 4, 0, 2, 1, 3, 5, 7, 6),
                    intArrayOf(991, 338, 38),
                    intArrayOf(338, 38, 991)
                ),
                Arguments.of(
                    intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                    intArrayOf(789, 456, 123),
                    intArrayOf(123, 456, 789)
                ),
            )
        }
    }
}