import o.mg.ListNode
import o.mg.hasCycle
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class `Linked List Cycle Test` {
    @Test
    fun case1() {
        val n3 = ListNode(3)
        val n2 = ListNode(2)
        n3.next = n2
        val n0 = ListNode(0)
        n2.next = n0
        val n4 = ListNode(4)
        n0.next = n4
        n4.next = n2
        println(n3)
        assertTrue { hasCycle(n3) }
    }

    @Test
    fun case2() {
        val n1 = ListNode(1)
        val n2 = ListNode(2)
        n1.next = n2
        n2.next = n1
        assertTrue { hasCycle(n1) }
    }

    @Test
    fun case3() {
        val n1 = ListNode(1)
        assertFalse { hasCycle(n1) }
    }
}