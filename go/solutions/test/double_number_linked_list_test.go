package solutions_test

import (
	"solutions"
	"testing"
)

func TestDoubleIt(t *testing.T) {
	// Test case 1: Input is 189
	expected := &solutions.ListNode{Val: 3, Next: &solutions.ListNode{Val: 7, Next: &solutions.ListNode{Val: 8, Next: nil}}}
	actual := solutions.DoubleIt(&solutions.ListNode{Val: 1, Next: &solutions.ListNode{Val: 8, Next: &solutions.ListNode{Val: 9, Next: nil}}})
	if !actual.Equals(expected) {
		t.Errorf("Expected %s, but got %s", expected, actual)
	}

	// Test case 2: Input is 999
	expected = &solutions.ListNode{Val: 1, Next: &solutions.ListNode{Val: 9, Next: &solutions.ListNode{Val: 9, Next: &solutions.ListNode{Val: 8, Next: nil}}}}
	actual = solutions.DoubleIt(&solutions.ListNode{Val: 9, Next: &solutions.ListNode{Val: 9, Next: &solutions.ListNode{Val: 9, Next: nil}}})
	if !actual.Equals(expected) {
		t.Errorf("Expected %s, but got %s", expected, actual)
	}
}
