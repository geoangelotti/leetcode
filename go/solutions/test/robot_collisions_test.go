package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSurvivedRobotsHealths(t *testing.T) {
	type args struct {
		positions  []int
		healths    []int
		directions string
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				[]int{5, 4, 3, 2, 1},
				[]int{2, 17, 9, 15, 10},
				"RRRRR",
			},
			[]int{2, 17, 9, 15, 10},
		},
		{
			"case2",
			args{
				[]int{3, 5, 2, 6},
				[]int{10, 10, 15, 12},
				"RLRL",
			},
			[]int{14},
		},
		{
			"case3",
			args{
				[]int{1, 2, 5, 6},
				[]int{10, 10, 11, 11},
				"RLRL",
			},
			[]int{},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.SurvivedRobotsHealths(tt.args.positions, tt.args.healths, tt.args.directions); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("reverseList() = %v, want %v", got, tt.expected)
			}
		})
	}
}
