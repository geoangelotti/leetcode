package o.mg

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null || list2 == null) {
        list1?.let { return list2 }
        list2?.let { return list1 }
        return null
    }
    if (list1.`val` > list2.`val`) {
        list2.next = mergeTwoLists(list1, list2.next)
        return list2
    }
    list1.next = mergeTwoLists(list1.next, list2)
    return list1
}