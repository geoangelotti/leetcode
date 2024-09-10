package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestIsSameTree(t *testing.T) {
	type args struct {
		p *solutions.TreeNode
		q *solutions.TreeNode
	}
	tests := []struct {
		name     string
		args     args
		expected bool
	}{
		{
			"case1",
			args{
				&solutions.TreeNode{Val: 1, Left: &solutions.TreeNode{Val: 2}, Right: &solutions.TreeNode{Val: 3}},
				&solutions.TreeNode{Val: 1, Left: &solutions.TreeNode{Val: 2}, Right: &solutions.TreeNode{Val: 3}},
			},
			true,
		},
		{
			"case2",
			args{
				&solutions.TreeNode{Val: 1, Left: &solutions.TreeNode{Val: 2}},
				&solutions.TreeNode{Val: 1, Right: &solutions.TreeNode{Val: 2}},
			},
			false,
		},
		{
			"case3",
			args{
				&solutions.TreeNode{Val: 1, Left: &solutions.TreeNode{Val: 1}, Right: &solutions.TreeNode{Val: 2}},
				&solutions.TreeNode{Val: 1, Left: &solutions.TreeNode{Val: 2}, Right: &solutions.TreeNode{Val: 1}},
			},
			false,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.IsSameTree(tt.args.p, tt.args.q); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("IsSameTree(%v, %v) = %v, want %v", tt.args.p, tt.args.q, got, tt.expected)
			}
		})
	}
}
