package solutions

func KthDistinct(arr []string, k int) string {
	frequencies := map[string]int{}
	for _, s := range arr {
		frequencies[s] += 1
	}
	var c int
	for _, s := range arr {
		if frequencies[s] == 1 && c+1 == k {
			return s
		}
		if frequencies[s] == 1 {
			c += 1
		}
	}
	return ""
}
