package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestLongestSubarray(t *testing.T) {
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
				[]int{1, 2, 3, 3, 2, 2},
			},
			2,
		},
		{
			"case2",
			args{
				[]int{1, 2, 3, 4},
			},
			1,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.LongestSubarray(tt.args.nums); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("LongestSubarray(%v) = %v, want %v", tt.args.nums, got, tt.expected)
			}
		})
	}
}
