package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSmallestDistancePair(t *testing.T) {
	type args struct {
		nums []int
		k    int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case 1",
			args{
				[]int{1, 3, 1},
				1,
			},
			0,
		},
		{
			"case 2",
			args{
				[]int{1, 1, 1},
				2,
			},
			0,
		},
		{
			"case 3",
			args{
				[]int{1, 6, 1},
				3,
			},
			5,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SmallestDistancePair(tt.args.nums, tt.args.k); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("reverseList() = %v, want %v", got, tt.expected)
			}
		})
	}
}
