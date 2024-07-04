import o.mg.ListNode
import o.mg.mergeNodes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Merge Nodes in Between Zeros Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMergeNodes(input: ListNode?, expected: ListNode?) {
        val result = mergeNodes(input)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(ListNode(listOf(0, 3, 1, 0, 4, 5, 2, 0)), ListNode(listOf(4, 11))),
                Arguments.of(ListNode(listOf(0, 1, 0, 3, 0, 2, 2, 0)), ListNode(listOf(1, 3, 4))),
            )
        }
    }
}