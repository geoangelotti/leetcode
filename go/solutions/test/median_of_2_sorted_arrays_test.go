package solutions_test

import (
	"math"
	"solutions"
	"testing"
)

const float64EqualityThreshold = 1e-9

func almostEqual(a, b float64) bool {
	return math.Abs(a-b) <= float64EqualityThreshold
}

func TestFindMedianSortedArrays(t *testing.T) {
	expected := 2.0
	actual := solutions.FindMedianSortedArrays([]int{1, 2}, []int{2})
	if !almostEqual(actual, expected) {
		t.Errorf("Expected %f, but got %f", expected, actual)
	}

	expected = 2.5
	actual = solutions.FindMedianSortedArrays([]int{1, 2}, []int{3, 4})
	if !almostEqual(actual, expected) {
		t.Errorf("Expected %f, but got %f", expected, actual)
	}
}
