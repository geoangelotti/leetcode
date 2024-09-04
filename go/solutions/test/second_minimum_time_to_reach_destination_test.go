package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSecondMinimum(t *testing.T) {
	type args struct {
		n      int
		edges  [][]int
		time   int
		change int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				5,
				[][]int{
					{1, 2},
					{1, 3},
					{1, 4},
					{3, 4},
					{4, 5},
				},
				3,
				5,
			},
			13,
		},
		{
			"case2",
			args{
				2,
				[][]int{
					{1, 2},
				},
				3,
				2,
			},
			11,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SecondMinimum(tt.args.n, tt.args.edges, tt.args.time, tt.args.change); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("SecondMinimum(%v, %v, %v, %v) = %v, want %v", tt.args.n, tt.args.edges, tt.args.time, tt.args.change, got, tt.expected)
			}
		})
	}
}
