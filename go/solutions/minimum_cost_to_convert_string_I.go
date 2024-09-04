package solutions

func MinimumCost(source, target string, original, changed []byte, cost []int) (ans int64) {
	adj := [26][26]int64{}
	for i := range adj {
		for j := range adj[i] {
			adj[i][j] = 1<<31 - 1
		}
		adj[i][i] = 0
	}
	for i := range original {
		u, v := original[i]-'a', changed[i]-'a'
		if nc := int64(cost[i]); nc < adj[u][v] {
			adj[u][v] = nc
		}
	}
	for k := 0; k < 26; k++ {
		for i := 0; i < 26; i++ {
			for j := 0; j < 26; j++ {
				if nc := adj[i][k] + adj[k][j]; nc < adj[i][j] {
					adj[i][j] = nc
				}
			}
		}
	}
	for i := range source {
		s, t := source[i]-'a', target[i]-'a'
		switch {
		case s == t:
		case adj[s][t] >= 1<<31-1:
			return -1
		default:
			ans += adj[s][t]
		}
	}
	return ans
}
