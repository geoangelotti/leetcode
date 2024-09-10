package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestInsertGreatestCommonDivisors(t *testing.T) {
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
				solutions.NewListNode([]int{18, 6, 10, 3}),
			},
			solutions.NewListNode([]int{18, 6, 6, 2, 10, 1, 3}),
		},
		{
			"case2",
			args{
				&solutions.ListNode{Val: 7},
			},
			&solutions.ListNode{Val: 7},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.InsertGreatestCommonDivisors(tt.args.head); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("InsertGreatestCommonDivisors(%v) = %v, want %v", tt.args.head, got, tt.expected)
			}
		})
	}
}
