package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestXorQueries(t *testing.T) {
	type args struct {
		array   []int
		queries [][]int
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				[]int{1, 3, 4, 8},
				[][]int{
					{0, 1},
					{1, 2},
					{0, 3},
					{3, 3},
				},
			},
			[]int{2, 7, 14, 8},
		},
		{
			"case2",
			args{
				[]int{4, 8, 2, 10},
				[][]int{
					{2, 3},
					{1, 3},
					{0, 0},
					{0, 3},
				},
			},
			[]int{8, 0, 4, 4},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.XorQueries(tt.args.array, tt.args.queries); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("XorQueries(%v, %v) = %v, want %v", tt.args.array, tt.args.queries, got, tt.expected)
			}
		})
	}
}
