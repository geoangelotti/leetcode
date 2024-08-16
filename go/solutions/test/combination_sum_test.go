package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestCombinationSum(t *testing.T) {
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
				[]int{2, 3, 6, 7},
				7,
			},
			[][]int{
				{2, 2, 3},
				{7},
			},
		},
		{
			"case 2",
			args{
				[]int{2, 3, 5},
				8,
			},
			[][]int{
				{2, 2, 2, 2},
				{2, 3, 3},
				{3, 5},
			},
		},
		{
			"case 3",
			args{
				[]int{2},
				1,
			},
			[][]int{},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.CombinationSum(tt.args.candicates, tt.args.target); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("reverseList() = %v, want %v", got, tt.expected)
			}
		})
	}
}
