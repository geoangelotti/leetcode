package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestFindTheCity(t *testing.T) {
	type args struct {
		n         int
		edges     [][]int
		threshold int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				4,
				[][]int{
					{0, 1, 3},
					{1, 2, 1},
					{1, 3, 4},
					{2, 3, 1},
				},
				4,
			},
			3,
		},
		{
			"case2",
			args{
				5,
				[][]int{
					{0, 1, 2},
					{0, 4, 8},
					{1, 2, 3},
					{1, 4, 2},
					{2, 3, 1},
					{3, 4, 1},
				},
				2,
			},
			0,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.FindTheCity(tt.args.n, tt.args.edges, tt.args.threshold); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("FindTheCity(%v, %v, %v) = %v, want %v", tt.args.n, tt.args.edges, tt.args.threshold, got, tt.expected)
			}
		})
	}
}
