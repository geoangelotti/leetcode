import o.mg.ListNode
import o.mg.nodesBetweenCriticalPoints
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Find the Minimum and Maximum Number of Nodes Between Critical Points Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testNodesBetweenCriticalPoints(input: ListNode?, expected: IntArray) {
        val result = nodesBetweenCriticalPoints(input)
        assertTrue(expected.contentEquals(result))
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(ListNode(listOf(3, 1)), intArrayOf(-1, -1)),
                Arguments.of(ListNode(listOf(5, 3, 1, 2, 5, 1, 2)), intArrayOf(1, 3)),
                Arguments.of(ListNode(listOf(1, 3, 2, 2, 3, 2, 2, 2, 7)), intArrayOf(3, 3)),

                )
        }
    }
}