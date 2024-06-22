package solutions

import (
	"fmt"
	"strings"
)

type ListNode struct {
	Val  int
	Next *ListNode
}

func (n1 *ListNode) Equals(n2 *ListNode) bool {
	if n1 == nil && n2 == nil {
		return true
	}
	if n1.Val == n2.Val {
		return n1.Next.Equals(n2.Next)
	}
	return false
}

func (n *ListNode) String() string {
	if n == nil {
		return "[]"
	}
	builder := strings.Builder{}
	builder.WriteString("[")
	stringBuild(n, &builder)
	builder.WriteString("]")
	return builder.String()
}

func stringBuild(n *ListNode, acc *strings.Builder) {
	if n == nil {
		acc.WriteString("nil")
		return
	}
	acc.WriteString(fmt.Sprintf("%d, ", n.Val))
	stringBuild(n.Next, acc)
}

func NewListNode(nums []int) *ListNode {
	if len(nums) == 0 {
		return nil
	}
	head := &ListNode{Val: nums[0]}
	current := head
	for _, num := range nums[1:] {
		current.Next = &ListNode{Val: num}
		current = current.Next
	}
	return head
}
