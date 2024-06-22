package o.mg

fun doubleIt(head: ListNode?): ListNode? {
    val res = doubleItRemainder(head)
    if (res > 0) {
        val new = ListNode(res)
        new.next = head
        return new
    }
    return head
}

fun doubleItRemainder(node: ListNode?): Int {
    if (node != null) {
        val v = node.`val` * 2 + doubleItRemainder(node.next)
        node.`val` = v % 10
        return v / 10
    }
    return 0
}