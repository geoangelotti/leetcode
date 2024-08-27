package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestPreorder(t *testing.T) {
	type args struct {
		head *solutions.Node
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				&solutions.Node{
					Val: 1,
					Children: []*solutions.Node{
						{
							Val: 3,
							Children: []*solutions.Node{
								{Val: 5},
								{Val: 6},
							},
						},
						{Val: 2},
						{Val: 4},
					}}},
			[]int{1, 3, 5, 6, 2, 4},
		},
		{
			"case2",
			args{
				&solutions.Node{
					Val: 1,
					Children: []*solutions.Node{
						{Val: 2},
						{
							Val: 3,
							Children: []*solutions.Node{
								{Val: 6},
								{
									Val: 7,
									Children: []*solutions.Node{
										{
											Val: 11,
											Children: []*solutions.Node{
												{Val: 14},
											},
										},
									},
								},
							},
						},
						{
							Val: 4,
							Children: []*solutions.Node{
								{
									Val: 8,
									Children: []*solutions.Node{
										{Val: 12},
									},
								},
							},
						},
						{
							Val: 5,
							Children: []*solutions.Node{
								{
									Val: 9,
									Children: []*solutions.Node{
										{Val: 13},
									},
								},
								{Val: 10},
							},
						},
					}}},
			[]int{1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.Preorder(tt.args.head); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("Preorder(%v) = %v, want %v", tt.args.head, got, tt.expected)
			}
		})
	}
}
