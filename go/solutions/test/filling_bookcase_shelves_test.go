package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestMinHeightShelves(t *testing.T) {
	type args struct {
		books      [][]int
		shelfWidth int
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
					{1, 1},
					{2, 3},
					{2, 3},
					{1, 1},
					{1, 1},
					{1, 1},
					{1, 2},
				},
				4,
			},
			6,
		},
		{
			"case2",
			args{
				[][]int{
					{1, 3},
					{2, 4},
					{3, 2},
				},
				6,
			},
			4,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.MinHeightShelves(tt.args.books, tt.args.shelfWidth); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("MinHeightShelves(%v, %v) = %v, want %v", tt.args.books, tt.args.shelfWidth, got, tt.expected)
			}
		})
	}
}
