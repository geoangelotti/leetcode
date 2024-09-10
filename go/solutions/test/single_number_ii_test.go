package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSingleNumberII(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				[]int{2, 2, 3, 2},
			},
			3,
		},
		{
			"case2",
			args{
				[]int{0, 1, 0, 1, 0, 1, 99},
			},
			99,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SingleNumberII(tt.args.nums); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("SingleNumberII(%v) = %v, want %v", tt.args.nums, got, tt.expected)
			}
		})
	}
}
