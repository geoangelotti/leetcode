import o.mg.ListNode
import o.mg.reverseList
import kotlin.test.Test
import kotlin.test.assertEquals

class `Reverse Linked List Test` {
    @Test
    fun case1() {
        val result = reverseList(ListNode(listOf(1, 2, 3, 4, 5)))
        assertEquals(ListNode(listOf(5, 4, 3, 2, 1)), result)
    }

    @Test
    fun case2() {
        val result = reverseList(ListNode(listOf(1, 2)))
        assertEquals(ListNode(listOf(2, 1)), result)
    }

    @Test
    fun case3() {
        val result = reverseList(null)
        assertEquals(null, result)
    }
}