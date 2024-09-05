package solutions

func FindTheCity(n int, edges [][]int, distanceThreshold int) int {
	dist := make([][]int, n)
	for i := range dist {
		dist[i] = make([]int, n)
		for j := range dist[i] {
			dist[i][j] = 10001
		}
		dist[i][i] = 0
	}
	for _, edge := range edges {
		dist[edge[0]][edge[1]] = edge[2]
		dist[edge[1]][edge[0]] = edge[2]
	}
	for k := 0; k < n; k++ {
		for i := 0; i < n; i++ {
			for j := 0; j < n; j++ {
				if dist[i][k]+dist[k][j] < dist[i][j] {
					dist[i][j] = dist[i][k] + dist[k][j]
				}
			}
		}
	}
	minReachableCities := n
	result := -1
	for i := 0; i < n; i++ {
		reachableCities := 0
		for j := 0; j < n; j++ {
			if dist[i][j] <= distanceThreshold {
				reachableCities++
			}
		}
		if reachableCities <= minReachableCities {
			minReachableCities = reachableCities
			result = i
		}
	}
	return result
}
