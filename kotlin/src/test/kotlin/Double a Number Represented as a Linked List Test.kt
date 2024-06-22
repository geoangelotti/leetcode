import o.mg.ListNode
import o.mg.doubleIt
import kotlin.test.Test
import kotlin.test.assertEquals

class `Double a Number Represented as a Linked List Test` {
    @Test
    fun case1() {
        val l1 = ListNode(1)
        val l2 = ListNode(8)
        l1.next = l2
        val l3 = ListNode(9)
        l2.next = l3
        val result = doubleIt(l1)
        val a1 = ListNode(3)
        val a2 = ListNode(7)
        a1.next = a2
        val a3 = ListNode(8)
        a2.next = a3
        assertEquals(result, a1)
    }

    @Test
    fun case2() {
        val head = ListNode(listOf(9,9,9))
        val result = doubleIt(head)
        assertEquals(ListNode(listOf(1,9,9,8)), result)
    }
}