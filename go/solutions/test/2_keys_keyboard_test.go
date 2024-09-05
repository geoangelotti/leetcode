package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMinSteps(t *testing.T) {
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
				3,
			},
			3,
		},
		{
			"case2",
			args{
				1,
			},
			0,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MinSteps(tt.args.n); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MinSteps(%v) = %v, want %v", tt.args.n, got, tt.expected)
			}
		})
	}
}
