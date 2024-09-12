package solutions

func SwapPairs(head *ListNode) *ListNode {
	if head == nil {
		return head
	}
	next := head.Next
	if next == nil {
		return head
	}
	temp := head.Val
	head.Val = next.Val
	next.Val = temp
	next.Next = SwapPairs(next.Next)
	return head
}
