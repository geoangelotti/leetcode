package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestClimbStairs(t *testing.T) {
	type args struct {
		n int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				2,
			},
			2,
		},
		{
			"case2",
			args{
				3,
			},
			3,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.ClimbStairs(tt.args.n); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("ClimbStairs(%v) = %v, want %v", tt.args.n, got, tt.expected)
			}
		})
	}
}
