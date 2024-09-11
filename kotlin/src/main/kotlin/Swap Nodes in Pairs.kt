package o.mg

fun swapPairs(head: ListNode?): ListNode? {
    if (head == null) {
        return head
    }
    if (head.next == null) {
        return head
    }
    var next = head.next
    head.next = swapPairs(next!!.next)
    next.next = head
    return next
}