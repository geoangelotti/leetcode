package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestTwoSum(t *testing.T) {
	type args struct {
		nums   []int
		target int
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				[]int{2, 7, 11, 15},
				9,
			},
			[]int{0, 1},
		},
		{
			"case2",
			args{
				[]int{3, 2, 4},
				6,
			},
			[]int{1, 2},
		},
		{
			"case3",
			args{
				[]int{3, 3},
				6,
			},
			[]int{0, 1},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.TwoSum(tt.args.nums, tt.args.target); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("TwoSum(%v, %v) = %v, want %v", tt.args.nums, tt.args.target, got, tt.expected)
			}
		})
	}
}
