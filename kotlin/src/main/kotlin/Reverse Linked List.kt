package o.mg

fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr = head
    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}