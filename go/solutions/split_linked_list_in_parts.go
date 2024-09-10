package solutions

func SplitListToParts(head *ListNode, k int) []*ListNode {
	current := head
	var length int
	for current != nil {
		length += 1
		current = current.Next
	}
	result := make([]*ListNode, k)
	quotient := length / k
	remainder := length % k
	var i int
	current = head
	for current != nil {
		result[i] = current
		currentLength := quotient
		if remainder > 0 {
			currentLength += 1
			remainder -= 1
		}
		for i := 0; i < currentLength-1; i++ {
			current = current.Next
		}
		temp := current.Next
		current.Next = nil
		current = temp
		i++
	}
	return result
}
