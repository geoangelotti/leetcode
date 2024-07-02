import o.mg.ListNode
import o.mg.addTwoNumbers
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class `Add Two Numbers Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testAddTwoNumbers(num1: ListNode, num2: ListNode, expected: ListNode) {
        val result = addTwoNumbers(num1, num2)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(ListNode(listOf(2, 4, 3)), ListNode(listOf(5, 6, 4)), ListNode(listOf(7, 0, 8))),
                Arguments.of(ListNode(listOf(0)), ListNode(listOf(0)), ListNode(listOf(0))),
                Arguments.of(
                    ListNode(listOf(9, 9, 9, 9, 9, 9, 9)),
                    ListNode(listOf(9, 9, 9, 9)),
                    ListNode(listOf(8, 9, 9, 9, 0, 0, 0, 1))
                ),
            )
        }
    }
}