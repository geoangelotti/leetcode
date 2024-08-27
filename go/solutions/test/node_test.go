package solutions_test

import (
	"reflect"
	"solutions"
	"testing"
)

func TestNode(t *testing.T) {
	var n1, n2 solutions.Node
	t.Run("both null", func(t *testing.T) {
		if !reflect.DeepEqual(n1, n2) {
			t.Errorf("%v not Equals() %v", n1, n2)
		}
	})
	n1 = solutions.Node{Val: 1, Children: []*solutions.Node{}}
	t.Run("one null", func(t *testing.T) {
		if reflect.DeepEqual(n1, n2) {
			t.Errorf("%v Equals() %v", n1, n2)
		}
	})
	n2 = solutions.Node{Val: 1, Children: []*solutions.Node{}}
	t.Run("equal", func(t *testing.T) {
		if !reflect.DeepEqual(n1, n2) {
			t.Errorf("%v not Equals() %v", n1, n2)
		}
	})
	n1.Children = []*solutions.Node{{Val: 2, Children: []*solutions.Node{{Val: 3}}}}
	n2.Children = []*solutions.Node{{Val: 2, Children: []*solutions.Node{{Val: 3}}}}
	t.Run("equal deep", func(t *testing.T) {
		if !reflect.DeepEqual(n1, n2) {
			t.Errorf("%v not Equals() %v", n1, n2)
		}
	})

}
