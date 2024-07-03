package o.mg

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var parent = ListNode(0)
    var current = parent
    var n1 = l1
    var n2 = l2
    var carry = 0
    while (n1 != null || n2 != null) {
        val v1 = n1?.`val` ?: 0
        val v2 = n2?.`val` ?: 0
        val sum = v1 + v2 + carry
        carry = sum / 10
        current.next = ListNode(sum % 10)
        current = current.next!!
        n1 = n1?.next
        n2 = n2?.next
    }
    if (carry > 0) {
        current.next = ListNode(carry)
    }
    return parent.next
}