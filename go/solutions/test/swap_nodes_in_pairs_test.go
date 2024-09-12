package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSwapPairs(t *testing.T) {
	type args struct {
		head *solutions.ListNode
	}
	tests := []struct {
		name     string
		args     args
		expected *solutions.ListNode
	}{
		{
			"case1",
			args{
				solutions.NewListNode([]int{1, 2, 3, 4}),
			},
			solutions.NewListNode([]int{2, 1, 4, 3}),
		},
		{
			"case2",
			args{
				nil,
			},
			nil,
		},
		{
			"case3",
			args{
				&solutions.ListNode{Val: 1},
			},
			&solutions.ListNode{Val: 1},
		},
		{
			"case4",
			args{
				solutions.NewListNode([]int{1, 2, 3}),
			},
			solutions.NewListNode([]int{2, 1, 3}),
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SwapPairs(tt.args.head); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("SwapPairs(%v) = %v, want %v", tt.args.head, got, tt.expected)
			}
		})
	}
}
