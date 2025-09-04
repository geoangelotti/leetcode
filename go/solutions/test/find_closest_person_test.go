package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestXxx(t *testing.T) {
	type args struct {
		x int
		y int
		z int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				2, 7, 4,
			},
			1,
		},
		{
			"case1",
			args{
				2, 5, 6,
			},
			2,
		},
		{
			"case1",
			args{
				1, 5, 3,
			},
			0,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.FindClosest(tt.args.x, tt.args.y, tt.args.z); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("FindClosest(%v) = %v, want %v", tt.args, got, tt.expected)
			}
		})
	}

}
