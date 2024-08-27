package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestHammingWeight(t *testing.T) {
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
			args{11},
			3,
		},
		{
			"case2",
			args{128},
			1,
		},
		{
			"case3",
			args{2147483645},
			30,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.HammingWeight(tt.args.n); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("HammingWeight(%v) = %v, want %v", tt.args.n, got, tt.expected)
			}
		})
	}
}
