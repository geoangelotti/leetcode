import o.mg.ListNode
import o.mg.doubleIt
import kotlin.test.Test
import kotlin.test.assertEquals

class `Double a Number Represented as a Linked List Test` {
    @Test
    fun case1() {
        val n1 = ListNode(1)
        val n8 = ListNode(8)
        n1.next = n8
        var n9 = ListNode(9)
        n8.next = n9
        val result = doubleIt(n1)
        val n3 = ListNode(3)
        val n7 = ListNode(7)
        n3.next = n7
        val nn9 = ListNode(9)
        n7.next = nn9
        assertEquals(result, n3)
    }
}