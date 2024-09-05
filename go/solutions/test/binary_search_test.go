package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestSearch(t *testing.T) {
	type args struct {
		nums   []int
		target int
	}
	tests := []struct {
		name     string
		args     args
		expected int
	}{
		{
			"case1",
			args{
				[]int{-1, 0, 3, 5, 9, 12},
				9,
			},
			4,
		},
		{
			"case2",
			args{
				[]int{-1, 0, 3, 5, 9, 12},
				2,
			},
			-1,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.Search(tt.args.nums, tt.args.target); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("Search(%v, %v) = %v, want %v", tt.args.nums, tt.args.target, got, tt.expected)
			}
		})
	}
}
