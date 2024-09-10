package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSingleNumberIII(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				[]int{1, 2, 1, 3, 2, 5},
			},
			[]int{3, 5},
		},
		{
			"case2",
			args{
				[]int{-1, 0},
			},
			[]int{-1, 0},
		},
		{
			"case3",
			args{
				[]int{0, 1},
			},
			[]int{1, 0},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SingleNumberIII(tt.args.nums); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("SingleNumberIII(%v) = %v, want %v", tt.args.nums, got, tt.expected)
			}
		})
	}
}
