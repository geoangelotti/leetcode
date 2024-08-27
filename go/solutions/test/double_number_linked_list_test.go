package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestDoubleIt(t *testing.T) {
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
				solutions.NewListNode([]int{1, 8, 9}),
			},
			solutions.NewListNode([]int{3, 7, 8}),
		},
		{
			"case2",
			args{
				solutions.NewListNode([]int{9, 9, 9}),
			},
			solutions.NewListNode([]int{1, 9, 9, 8}),
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.DoubleIt(tt.args.head); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("DoubleIt(%v) = %v, want %v", tt.args.head, got, tt.expected)
			}
		})
	}
}
