import o.mg.ListNode
import o.mg.swapPairs
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Swap Nodes in Pairs Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSwapPairs(head: ListNode?, expected: ListNode?) {
        val result = swapPairs(head)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(ListNode(listOf(1, 2, 3, 4)), ListNode(listOf(2, 1, 4, 3))),
                Arguments.of(null, null),
                Arguments.of(ListNode(1), ListNode(1)),
                Arguments.of(ListNode(listOf(1, 2, 3)), ListNode(listOf(2, 1, 3))),
            )
        }
    }
}