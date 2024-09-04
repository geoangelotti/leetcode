package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestRobotSim(t *testing.T) {
	type args struct {
		commands  []int
		obstacles [][]int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				[]int{4, -1, 3},
				[][]int{},
			},
			25,
		},
		{
			"case2",
			args{
				[]int{4, -1, 4, -2, 4},
				[][]int{
					{2, 4},
				},
			},
			65,
		},
		{
			"case3",
			args{
				[]int{6, -1, -1, 6},
				[][]int{},
			},
			36,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.RobotSim(tt.args.commands, tt.args.obstacles); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("RobotSim(%v, %v) = %v, want %v", tt.args.obstacles, tt.args.commands, got, tt.expected)
			}
		})
	}
}
