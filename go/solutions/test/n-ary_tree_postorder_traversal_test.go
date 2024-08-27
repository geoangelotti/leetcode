package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestPostorder(t *testing.T) {
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
			[]int{5, 6, 3, 2, 4, 1},
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
			[]int{2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.Postorder(tt.args.head); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("Postorder(%v) = %v, want %v", tt.args.head, got, tt.expected)
			}
		})
	}
}
