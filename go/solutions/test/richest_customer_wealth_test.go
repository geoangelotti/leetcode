package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMaximumWealth(t *testing.T) {
	type args struct {
		accounts [][]int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				[][]int{
					{1, 2, 3},
					{3, 2, 1},
				},
			},
			6,
		},
		{
			"case2",
			args{
				[][]int{
					{1, 5},
					{7, 3},
					{3, 5},
				},
			},
			10,
		},
		{
			"case3",
			args{
				[][]int{
					{2, 8, 7},
					{7, 1, 3},
					{1, 9, 5},
				},
			},
			17,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MaximumWealth(tt.args.accounts); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MaximumWealth(%v) = %v, want %v", tt.args.accounts, got, tt.expected)
			}
		})
	}
}
