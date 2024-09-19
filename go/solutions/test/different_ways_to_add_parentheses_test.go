package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestDiffWaysToCompute(t *testing.T) {
	type args struct {
		expression string
	}
	tests := []struct {
		name     string
		args     args
		expected []int
	}{
		{
			"case1",
			args{
				"2-1-1",
			},
			[]int{2, 0},
		},
		{
			"case1",
			args{
				"2*3-4*5",
			},
			[]int{-34, -10, -14, -10, 10},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.DiffWaysToCompute(tt.args.expression); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("DiffWaysToCompute(%v) = %v, want %v", tt.args.expression, got, tt.expected)
			}
		})
	}
}
