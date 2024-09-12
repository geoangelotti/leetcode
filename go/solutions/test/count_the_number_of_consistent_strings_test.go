package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestCountConsistentStrings(t *testing.T) {
	type args struct {
		allowed string
		words   []string
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				"ab",
				[]string{
					"ad", "bd", "aaab", "baa", "badab",
				},
			},
			2,
		},
		{
			"case2",
			args{
				"abc",
				[]string{
					"a", "b", "c", "ab", "ac", "bc", "abc",
				},
			},
			7,
		},
		{
			"case3",
			args{
				"cad",
				[]string{
					"cc", "acd", "b", "ba", "bac", "bad", "ac", "d",
				},
			},
			4,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.CountConsistentStrings(tt.args.allowed, tt.args.words); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("CountConsistentStrings(%v, %v) = %v, want %v", tt.args.allowed, tt.args.words, got, tt.expected)
			}
		})
	}
}
