package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestLemonadeChange(t *testing.T) {
	type args struct {
		bills []int
	}
	tests := []struct {
		name     string
		args     args
		expected bool
	}{
		{
			"case 1",
			args{
				[]int{5, 5, 5, 10, 20},
			},
			true,
		},
		{
			"case 2",
			args{
				[]int{5, 5, 10, 10, 20},
			},
			false,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := solutions.LemonadeChange(tt.args.bills); !reflect.DeepEqual(got, tt.expected) {
				t.Errorf("reverseList() = %v, want %v", got, tt.expected)
			}
		})
	}
}
