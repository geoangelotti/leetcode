package solutions_test

import (
	"solutions"
	"testing"
)

func TestBuildMatrix(t *testing.T) {
	type args struct {
		k             int
		rowConditions [][]int
		colConditions [][]int
	}
	tests := []struct {
		name     string
		args     args
		expected [][]int
	}{
		{
			"case1",
			args{
				3,
				[][]int{
					{1, 2},
					{3, 2},
				},
				[][]int{
					{2, 1},
					{3, 2},
				},
			},
			[][]int{
				{3, 0, 0},
				{0, 0, 1},
				{0, 2, 0},
			},
		},
		{
			"case2",
			args{
				3,
				[][]int{
					{1, 2},
					{2, 3},
					{3, 1},
					{2, 3},
				},
				[][]int{
					{2, 1},
				},
			},
			[][]int{},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.BuildMatrix(tt.args.k, tt.args.rowConditions, tt.args.colConditions); !solutions.EqualSlices(got, tt.expected) {
				t.Errorf("BuildMatrix(%v, %v, %v) = %v, want %v", tt.args.k, tt.args.rowConditions, tt.args.colConditions, got, tt.expected)
			}
		})
	}
}
