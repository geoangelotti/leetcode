package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestReverseBits(t *testing.T) {
	type args struct {
		num uint32
	}
	tests := []struct {
		name     string
		args     args
		expected uint32
	}{
		{
			"case1",
			args{
				43261596,
			},
			964176192,
		},
		{
			"case2",
			args{
				4294967293,
			},
			3221225471,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.ReverseBits(tt.args.num); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("ReverseBits(%v) = %v, want %v", tt.args.num, got, tt.expected)
			}
		})
	}
}
