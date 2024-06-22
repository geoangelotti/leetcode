import o.mg.ListNode
import o.mg.mergeTwoLists
import java.util.stream.Stream
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class `Merge Two Sorted Lists Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testMergeTwoLists(a: ListNode?, b: ListNode?, expected: ListNode?) {
        val result = mergeTwoLists(a, b)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(ListNode(listOf(1, 2, 4)), ListNode(listOf(1, 3, 4)), ListNode(listOf(1, 1, 2, 3, 4, 4))),
                Arguments.of(null, null, null),
                Arguments.of(null, ListNode(0), ListNode(0)),
            )
        }
    }
}

