package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSingleNumber(t *testing.T) {
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
				[]int{2, 2, 1},
			},
			1,
		},
		{
			"case2",
			args{
				[]int{4, 1, 2, 1, 2},
			},
			4,
		},
		{
			"case3",
			args{
				[]int{1},
			},
			1,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SingleNumber(tt.args.nums); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("SingleNumber(%v) = %v, want %v", tt.args.nums, got, tt.expected)
			}
		})
	}
}
