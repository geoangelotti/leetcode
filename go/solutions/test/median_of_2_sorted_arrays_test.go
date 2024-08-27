package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestFindMedianSortedArrays(t *testing.T) {
	type args struct {
		nums1 []int
		nums2 []int
	}
	tests := []struct {
		name     string
		args     args
		expected float64
	}{
		{
			"case1",
			args{
				[]int{1, 2},
				[]int{2},
			},
			2.0,
		},
		{
			"case2",
			args{
				[]int{1, 2},
				[]int{3, 4},
			},
			2.5,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.FindMedianSortedArrays(tt.args.nums1, tt.args.nums2); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("ReverseList(%v, %v) = %v, want %v", tt.args.nums1, tt.args.nums2, got, tt.expected)
			}
		})
	}
}
