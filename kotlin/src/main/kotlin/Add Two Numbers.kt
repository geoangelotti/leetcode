package o.mg

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    return addTwoNumbersRemainder(l1,l2,0)
}

fun addTwoNumbersRemainder(l1: ListNode?, l2: ListNode?, remainder: Int): ListNode? {
    if (l1 == null && l2 == null) {
        if (remainder  == 0) {
            return null
        }
        return ListNode(remainder)
    }
    if (l1 == null) {
        val sum = remainder + l2!!.`val`
        if (sum >= 10) {
          val rem = sum % 10
          val res = ListNode(rem)
            res.next = addTwoNumbersRemainder(null, l2.next, 1)
            return res
        } else {
            val res = ListNode(sum)
            res.next = addTwoNumbersRemainder(null, l2.next, 0)
            return res
        }
    }
    if (l2 == null) {
        val sum = remainder + l1!!.`val`
        if (sum >= 10) {
            val rem = sum % 10
            val res = ListNode(rem)
            res.next = addTwoNumbersRemainder(l1.next, null, 1)
            return res
        } else {
            val res = ListNode(sum)
            res.next = addTwoNumbersRemainder(l1.next, null, 0)
            return res
        }
    }
    val sum = remainder + l1.`val` + l2.`val`
    if (sum >= 10) {
        val rem = sum % 10
        val res = ListNode(rem)
        res.next = addTwoNumbersRemainder(l1.next, l2.next, 1)
        return res
    } else {
        val res = ListNode(sum)
        res.next = addTwoNumbersRemainder(l1.next, l2.next, 0)
        return res
    }
    return null
}