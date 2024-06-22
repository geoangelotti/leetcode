package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestReverseList(t *testing.T) {
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
			args:     args{head: solutions.NewListNode([]int{1, 2, 3, 4, 5})},
			expected: solutions.NewListNode([]int{5, 4, 3, 2, 1}),
		},
		{
			name:     "case2",
			args:     args{head: solutions.NewListNode([]int{1, 2})},
			expected: solutions.NewListNode([]int{2, 1}),
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
