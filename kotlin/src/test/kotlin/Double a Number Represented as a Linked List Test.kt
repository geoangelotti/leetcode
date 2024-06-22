import o.mg.ListNode
import o.mg.doubleIt
import kotlin.test.Test
import kotlin.test.assertEquals

class `Double a Number Represented as a Linked List Test` {
    @Test
    fun case1() {
        val head = ListNode(listOf(1,8,9))
        val result = doubleIt(head)
        assertEquals(ListNode(listOf(3,7,8)), result)
    }

    @Test
    fun case2() {
        val head = ListNode(listOf(9,9,9))
        val result = doubleIt(head)
        assertEquals(ListNode(listOf(1,9,9,8)), result)
    }
}