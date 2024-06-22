package solutions

import (
	"reflect"
	"solutions"
	"testing"
)

func Test_reverseList(t *testing.T) {
	type args struct {
		head *solutions.ListNode
	}
	tests := []struct {
		name     string
		args     args
		expected *solutions.ListNode
	}{
		{
			name:     "case1",
			args:     args{head: &solutions.ListNode{Val: 1, Next: &solutions.ListNode{Val: 2, Next: &solutions.ListNode{Val: 3, Next: &solutions.ListNode{Val: 4, Next: &solutions.ListNode{Val: 5}}}}}},
			expected: &solutions.ListNode{Val: 5, Next: &solutions.ListNode{Val: 4, Next: &solutions.ListNode{Val: 3, Next: &solutions.ListNode{Val: 2, Next: &solutions.ListNode{Val: 1}}}}},
		},
		{
			name:     "case2",
			args:     args{head: &solutions.ListNode{Val: 1, Next: &solutions.ListNode{Val: 2}}},
			expected: &solutions.ListNode{Val: 2, Next: &solutions.ListNode{Val: 1}},
		},
		{
			name:     "case3",
			args:     args{head: nil},
			expected: nil,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.ReverseList(tt.args.head); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("reverseList() = %v, want %v", got, tt.expected)
			}
		})
	}
}
