import o.mg.smallestDistancePair
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Find K-th Smallest Pair Distance Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSmallestDistancePair(nums: IntArray, k: Int, expected: Int) {
        val result = smallestDistancePair(nums, k)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 3, 1), 1, 0),
                Arguments.of(intArrayOf(1, 1, 1), 2, 0),
                Arguments.of(intArrayOf(1, 6, 1), 3, 5),
            )
        }
    }
}