package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMaxDistance(t *testing.T) {
	type args struct {
		arrays [][]int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case 1",
			args{
				[][]int{
					{1, 2, 3},
					{4, 5},
					{1, 2, 3},
				},
			},
			4,
		},
		{
			"case 2",
			args{
				[][]int{
					{1},
					{1},
				},
			},
			0,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MaxDistance(tt.args.arrays); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MaxDistance(%v) = %v, want %v", tt.args.arrays, got, tt.expected)
			}
		})
	}
}
