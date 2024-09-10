package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestReverseString(t *testing.T) {
	type args struct {
		s []byte
	}
	tests := []struct {
		name     string
		args     args
		expected []byte
	}{
		{
			"case1",
			args{
				[]byte{'h', 'e', 'l', 'l', 'o'},
			},
			[]byte{'o', 'l', 'l', 'e', 'h'},
		},
		{
			"case2",
			args{
				[]byte{'H', 'a', 'n', 'n', 'a', 'h'},
			},
			[]byte{'h', 'a', 'n', 'n', 'a', 'H'},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			s := tt.args.s[:]
			if solutions.ReverseString(s); !reflect.DeepEqual(s, tt.expected) {
				t.Errorf("SingleNumberIII(%v) = %v, want %v", tt.args.s, s, tt.expected)
			}
		})
	}
}
