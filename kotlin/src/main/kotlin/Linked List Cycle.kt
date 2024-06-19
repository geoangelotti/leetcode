package o.mg

fun hasCycle(head: ListNode?): Boolean {
    val seen = mutableSetOf<ListNode>()
    if (head == null) return false
    var next: ListNode? = head.next
    while (next != null) {
        if (seen.contains(next)) {
            return true
        }
        seen.add(next)
        next = next.next
    }
    return false
}