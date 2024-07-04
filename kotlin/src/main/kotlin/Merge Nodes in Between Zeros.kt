package o.mg

fun mergeNodes(head: ListNode?): ListNode? {
    var result = ListNode(0)
    var current: ListNode = result
    var node = head
    var sum = 0
    while (node != null) {
        if (node.`val` == 0) {
            if (sum == 0) {
                node = node.next
                continue
            }
            current.next = ListNode(sum)
            current = current.next!!
            sum = 0
            node = node.next
            continue
        }
        sum += node.`val`
        node = node.next
    }
    return result.next
}