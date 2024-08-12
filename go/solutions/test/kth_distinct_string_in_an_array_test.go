package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestKthDistinct(t *testing.T) {
	type args struct {
		array []string
		k     int
	}
	tests := []struct {
		name     string
		args     args
		expected string
	}{
		{
			"case1",
			args{
				[]string{"d", "b", "c", "b", "c", "a"},
				2,
			},
			"a",
		},
		{
			"case2",
			args{
				[]string{"aaa", "aa", "a"},
				1,
			},
			"aaa",
		},
		{
			"case3",
			args{
				[]string{"a", "b", "a"},
				3,
			},
			"",
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.KthDistinct(tt.args.array, tt.args.k); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("reverseList() = %v, want %v", got, tt.expected)
			}
		})
	}
}
