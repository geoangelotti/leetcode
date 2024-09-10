package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSplitListToParts(t *testing.T) {
	type args struct {
		head *solutions.ListNode
		k    int
	}
	tests := []struct {
		name     string
		args     args
		expected []*solutions.ListNode
	}{
		{
			"case1",
			args{
				solutions.NewListNode([]int{1, 2, 3}),
				5,
			},
			[]*solutions.ListNode{
				{Val: 1},
				{Val: 2},
				{Val: 3},
				nil,
				nil,
			},
		},
		{
			"case2",
			args{
				solutions.NewListNode([]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
				10,
			},
			[]*solutions.ListNode{
				solutions.NewListNode([]int{1, 2, 3, 4}),
				solutions.NewListNode([]int{5, 6, 7}),
				solutions.NewListNode([]int{8, 9, 10}),
			},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SplitListToParts(tt.args.head, tt.args.k); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("SplitListToParts(%v, %v) = %v, want %v", tt.args.head, tt.args.k, got, tt.expected)
			}
		})
	}
}
