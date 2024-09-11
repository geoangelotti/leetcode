package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMinBitFlips(t *testing.T) {
	type args struct {
		start int
		goal  int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				10,
				7,
			},
			3,
		},
		{
			"case2",
			args{
				3,
				4,
			},
			3,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MinBitFlips(tt.args.start, tt.args.goal); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MinBitFlips(%v, %v) = %v, want %v", tt.args.start, tt.args.goal, got, tt.expected)
			}
		})
	}
}
