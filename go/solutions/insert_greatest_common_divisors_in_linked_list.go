package solutions

func InsertGreatestCommonDivisors(head *ListNode) *ListNode {
	if head == nil {
		return nil
	}
	current := head
	for current.Next != nil {
		next := current.Next
		gcd := ListNode{Val: greatestCommonDivisors(current.Val, next.Val), Next: next}
		current.Next = &gcd
		current = next
	}
	return head
}

func greatestCommonDivisors(a, b int) int {
	if b == 0 {
		return a
	}
	temp := a
	a = b
	b = temp % a
	return greatestCommonDivisors(a, b)
}
