package solutions

func MergeTwoSortedLists(list1 *ListNode, list2 *ListNode) *ListNode {
	if list1 == nil || list2 == nil {
		if list1 != nil {
			return list1
		}
		if list2 != nil {
			return list2
		}
		return nil
	}
	if list1.Val > list2.Val {
		list2.Next = MergeTwoSortedLists(list1, list2.Next)
		return list2
	}
	list1.Next = MergeTwoSortedLists(list1.Next, list2)
	return list1
}
