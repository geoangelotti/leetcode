package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestRestoreMatrix(t *testing.T) {
	type args struct {
		rowSum []int
		colSum []int
	}
	tests := []struct {
		name     string
		args     args
		expected [][]int
	}{
		{
			"case1",
			args{
				[]int{3, 8},
				[]int{4, 7},
			},
			[][]int{
				{3, 0},
				{1, 7},
			},
		},
		{
			"case2",
			args{
				[]int{5, 7, 10},
				[]int{8, 6, 8},
			},
			[][]int{
				{5, 0, 0},
				{3, 4, 0},
				{0, 2, 8},
			},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.RestoreMatrix(tt.args.rowSum, tt.args.colSum); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("RestoreMatrix(%v, %v) = %v, want %v", tt.args.rowSum, tt.args.colSum, got, tt.expected)
			}
		})
	}
}
