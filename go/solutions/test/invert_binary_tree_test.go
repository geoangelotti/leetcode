package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestInvert(t *testing.T) {
	type args struct {
		root *solutions.TreeNode
	}
	tests := []struct {
		name     string
		args     args
		expected *solutions.TreeNode
	}{
		{
			"case1",
			args{
				&solutions.TreeNode{Val: 4, Left: &solutions.TreeNode{Val: 2, Left: &solutions.TreeNode{Val: 1, Left: nil, Right: nil}, Right: &solutions.TreeNode{Val: 3, Left: nil, Right: nil}}, Right: &solutions.TreeNode{Val: 7, Left: &solutions.TreeNode{Val: 6, Left: nil, Right: nil}, Right: &solutions.TreeNode{Val: 9, Left: nil, Right: nil}}},
			},
			&solutions.TreeNode{Val: 4, Left: &solutions.TreeNode{Val: 7, Left: &solutions.TreeNode{Val: 9, Left: nil, Right: nil}, Right: &solutions.TreeNode{Val: 6, Left: nil, Right: nil}}, Right: &solutions.TreeNode{Val: 2, Left: &solutions.TreeNode{Val: 3, Left: nil, Right: nil}, Right: &solutions.TreeNode{Val: 1, Left: nil, Right: nil}}},
		},
		{
			"case2",
			args{
				&solutions.TreeNode{Val: 2, Left: &solutions.TreeNode{Val: 1, Left: nil, Right: nil}, Right: &solutions.TreeNode{Val: 3, Left: nil, Right: nil}},
			},
			&solutions.TreeNode{Val: 2, Left: &solutions.TreeNode{Val: 3, Left: nil, Right: nil}, Right: &solutions.TreeNode{Val: 1, Left: nil, Right: nil}},
		},
		{
			"case3",
			args{
				nil,
			},
			nil,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.InvertTree(tt.args.root); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("InvertTree(%v) = %v, want %v", tt.args.root, got, tt.expected)
			}
		})
	}
}
