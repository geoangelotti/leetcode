import o.mg.containsDuplicate
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Contains Duplicate Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testContainsDuplicate(nums: IntArray, expected: Boolean) {
        val result = containsDuplicate(nums)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 2, 3, 1), true),
                Arguments.of(intArrayOf(1, 2, 3, 4), false),
                Arguments.of(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), true),
            )
        }
    }
}