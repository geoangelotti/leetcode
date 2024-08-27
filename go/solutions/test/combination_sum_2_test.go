package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestCombinationSum2(t *testing.T) {
	type args struct {
		candicates []int
		target     int
	}
	tests := []struct {
		name     string
		args     args
		expected [][]int
	}{
		{
			"case 1",
			args{
				[]int{10, 1, 2, 7, 6, 1, 5},
				8,
			},
			[][]int{
				{1, 1, 6},
				{1, 2, 5},
				{1, 7},
				{2, 6},
			},
		},
		{
			"case 2",
			args{
				[]int{2, 5, 2, 1, 2},
				5,
			},
			[][]int{
				{1, 2, 2},
				{5},
			},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.CombinationSum2(tt.args.candicates, tt.args.target); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("CombinationSum2(%v, %v) = %v, want %v", tt.args.candicates, tt.args.target, got, tt.expected)
			}
		})
	}
}
