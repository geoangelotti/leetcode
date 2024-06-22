package solutions

func ReverseList(head *ListNode) *ListNode {
	var previous *ListNode
	current := head
	for current != nil {
		next := current.Next
		current.Next = previous
		previous = current
		current = next
	}
	return previous
}
