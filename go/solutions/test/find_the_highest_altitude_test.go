package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestLargestAltitude(t *testing.T) {
	type args struct {
		gain []int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				[]int{-5, 1, 5, 0, -7},
			},
			1,
		},
		{
			"case1",
			args{
				[]int{-4, -3, -2, -1, 4, 3, 2},
			},
			0,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.LargestAltitude(tt.args.gain); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("LargestAltitude(%v) = %v, want %v", tt.args.gain, got, tt.expected)
			}
		})
	}
}
