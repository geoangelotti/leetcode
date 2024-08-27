package solutions

func Preorder(root *Node) []int {
	if root == nil {
		return nil
	}
	var result []int
	result = append(result, root.Val)
	for _, child := range root.Children {
		childRes := Preorder(child)
		result = append(result, childRes...)
	}
	return result
}
