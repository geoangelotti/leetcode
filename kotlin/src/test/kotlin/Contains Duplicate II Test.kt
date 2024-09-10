import o.mg.containsNearbyDuplicate
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Contains Duplicate II Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testContainsNearbyDuplicate(nums: IntArray, k: Int, expected: Boolean) {
        val result = containsNearbyDuplicate(nums, k)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 2, 3, 1), 3, true),
                Arguments.of(intArrayOf(1, 0, 1, 1), 1, true),
                Arguments.of(intArrayOf(1, 2, 3, 1, 2, 3), 2, false),
            )
        }
    }
}