package solutions

func MaximumWealth(accounts [][]int) int {
	var max int = 0
	for _, customer := range accounts {
		var acc = 0
		for _, account := range customer {
			acc += account
		}
		if acc > max {
			max = acc
		}
	}
	return max
}
