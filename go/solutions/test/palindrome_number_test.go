package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestIsPalindrome(t *testing.T) {
	type args struct {
		x int
	}
	tests := []struct {
		name     string
		args     args
		expected bool
	}{
		{
			"case1",
			args{121},
			true,
		},
		{
			"case2",
			args{-121},
			false,
		},
		{
			"case3",
			args{10},
			false,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.IsPalindrome(tt.args.x); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("IsPalindrome(%v) = %v, want %v", tt.args.x, got, tt.expected)
			}
		})
	}
}
