package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestFrequencySort(t *testing.T) {
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
				[]int{1, 1, 2, 2, 2, 3},
			},
			[]int{3, 1, 1, 2, 2, 2},
		},
		{
			"case2",
			args{
				[]int{2, 3, 1, 3, 2},
			},
			[]int{1, 3, 3, 2, 2},
		},
		{
			"case3",
			args{
				[]int{-1, 1, -6, 4, 5, -6, 1, 4, 1},
			},
			[]int{5, -1, 4, 4, -6, -6, 1, 1, 1},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.FrequencySort(tt.args.nums); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("FrequencySort(%v) = %v, want %v", tt.args.nums, got, tt.expected)
			}
		})
	}
}
