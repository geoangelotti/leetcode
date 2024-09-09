import o.mg.topKFrequent
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Top K Frequent Elements Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testTopKFrequent(nums: IntArray, k: Int, expected: IntArray) {
        val result = topKFrequent(nums, k)
        assertTrue(expected.contentEquals(result))
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), 2, intArrayOf(1, 2)),
                Arguments.of(intArrayOf(1), 1, intArrayOf(1)),

                )
        }
    }
}