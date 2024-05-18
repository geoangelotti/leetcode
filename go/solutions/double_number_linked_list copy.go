package solutions

func DoubleIt(head *ListNode) *ListNode {
	var calc func(*ListNode) int
	calc = func(node *ListNode) int {
		if node != nil {
			v := node.Val*2 + calc(node.Next)
			node.Val = v % 10
			return v / 10
		}
		return 0
	}

	q := calc(head)
	if q > 0 {
		return &ListNode{Val: q, Next: head}
	}
	return head
}
