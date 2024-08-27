package solutions

func Postorder(root *Node) []int {
	post := []int{}
	dfs(root, &post)
	return post
}

func dfs(node *Node, post *[]int) {
	if node == nil {
		return
	}
	if len(node.Children) > 0 {
		for _, c := range node.Children {
			dfs(c, post)
		}
	}
	*post = append(*post, node.Val)
}
