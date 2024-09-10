import o.mg.singleNumber
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Single Number Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSingleNumber(nums: IntArray, expected: Int) {
        val expected = singleNumber(nums)
        assertEquals(expected, expected)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(2, 2, 1), 1),
                Arguments.of(intArrayOf(4, 1, 2, 1, 2), 4),
                Arguments.of(intArrayOf(1), 1),
            )
        }
    }
}