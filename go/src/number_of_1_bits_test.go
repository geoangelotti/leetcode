package src_test

import (
	"src"
	"testing"
)

func TestHammingWeight(t *testing.T) {
	// Test case 1: Input is 1011
	expected := 3
	actual := src.HammingWeight(11)
	if actual != expected {
		t.Errorf("Expected %d, but got %d", expected, actual)
	}

	// Test case 2: Input is 10000000
	expected = 1
	actual = src.HammingWeight(128)
	if actual != expected {
		t.Errorf("Expected %d, but got %d", expected, actual)
	}

	// Test case 3: Input is 1111111111111111111111111111101
	expected = 30
	actual = src.HammingWeight(2147483645)
	if actual != expected {
		t.Errorf("Expected %d, but got %d", expected, actual)
	}
}
