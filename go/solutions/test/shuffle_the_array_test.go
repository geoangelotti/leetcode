package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestShuffle(t *testing.T) {
	type args struct {
		nums []int
		n    int
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				[]int{2, 5, 1, 3, 4, 7},
				3,
			},
			[]int{2, 3, 5, 4, 1, 7},
		},
		{
			"case2",
			args{
				[]int{1, 2, 3, 4, 4, 3, 2, 1},
				4,
			},
			[]int{1, 4, 2, 3, 3, 2, 4, 1},
		},
		{
			"case3",
			args{
				[]int{1, 1, 2, 2},
				2,
			},
			[]int{1, 2, 1, 2},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.Shuffle(tt.args.nums, tt.args.n); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("Shuffle(%v, %v) = %v, want %v", tt.args.nums, tt.args.n, got, tt.expected)
			}
		})
	}
}
