import o.mg.intersectII
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertTrue

class `Intersection of Two Arrays II Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testIntersectII(nums1: IntArray, nums2: IntArray, expected: IntArray) {
        val result = intersectII(nums1, nums2)
        assertTrue { expected.contentEquals(result) }
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2), intArrayOf(2, 2)),
                Arguments.of(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4), intArrayOf(4, 9)),
                Arguments.of(),
            )
        }
    }
}