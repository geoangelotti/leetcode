package o.mg

fun hasCycle(head: ListNode?): Boolean {
    if (head == null) return false
    var slow = head
    var fast = head.next
    while (fast?.next != null && slow != null) {
        if (fast == slow) return true
        slow = slow.next
        fast = fast.next!!.next
    }
    return false
}