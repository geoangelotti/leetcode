package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMinimumCost(t *testing.T) {
	type args struct {
		source   string
		target   string
		original []byte
		changed  []byte
		cost     []int
	}
	tests := []struct {
		name     string
		args     args
		expected int64
	}{
		{
			"case1",
			args{
				"abcd",
				"acbe",
				[]byte{'a', 'b', 'c', 'c', 'e', 'd'},
				[]byte{'b', 'c', 'b', 'e', 'b', 'e'},
				[]int{2, 5, 5, 1, 2, 20},
			},
			28,
		},
		{
			"case2",
			args{
				"aaaa",
				"bbbb",
				[]byte{'a', 'c'},
				[]byte{'c', 'b'},
				[]int{1, 2},
			},
			12,
		},
		{
			"case3",
			args{
				"abcd",
				"abce",
				[]byte{'a'},
				[]byte{'e'},
				[]int{1000},
			},
			-1,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MinimumCost(tt.args.source, tt.args.target, tt.args.original, tt.args.changed, tt.args.cost); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MinimumCost(%v, %v, %v, %v, %v) = %v, want %v", tt.args.source, tt.args.target, tt.args.original, tt.args.changed, tt.args.cost, got, tt.expected)
			}
		})
	}
}
