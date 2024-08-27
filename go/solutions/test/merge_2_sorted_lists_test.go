package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMergeTwoSortedLists(t *testing.T) {
	type args struct {
		list1 *solutions.ListNode
		list2 *solutions.ListNode
	}
	tests := []struct {
		name     string
		args     args
		expected *solutions.ListNode
	}{
		{
			name:     "case1",
			args:     args{list1: solutions.NewListNode([]int{1, 2, 4}), list2: solutions.NewListNode([]int{1, 3, 4})},
			expected: solutions.NewListNode([]int{1, 1, 2, 3, 4, 4}),
		},
		{
			name:     "case2",
			args:     args{list1: nil, list2: nil},
			expected: nil,
		},
		{
			name:     "cas3",
			args:     args{list1: nil, list2: &solutions.ListNode{Val: 0}},
			expected: &solutions.ListNode{Val: 0},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MergeTwoSortedLists(tt.args.list1, tt.args.list2); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MergeTwoSortedLists(%v, %v) = %v, want %v", tt.args.list1, tt.args.list2, got, tt.expected)
			}
		})
	}
}
