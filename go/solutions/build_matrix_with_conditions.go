package solutions

func BuildMatrix(k int, rowConditions [][]int, colConditions [][]int) [][]int {
	toDown, toRight := topSort(k, rowConditions), topSort(k, colConditions)
	if len(toDown) == 0 || len(toRight) == 0 {
		return nil
	}
	byCol := make(map[int]int)
	for idx, num := range toRight {
		byCol[num] = idx
	}
	out := make([][]int, k)
	for i := range out {
		out[i] = make([]int, k)
	}
	for i, n := range toDown {
		out[i][byCol[n]] = n
	}
	return out
}

func topSort(k int, deps [][]int) []int {
	inDegree := make(map[int]int)
	for i := 1; i <= k; i++ {
		inDegree[i] = 0
	}

	byVertex := make(map[int][]int)
	for _, req := range deps {
		byVertex[req[0]] = append(byVertex[req[0]], req[1])
		inDegree[req[1]]++
	}
	out := make([]int, 0)
	for len(out) != k {
		queue := make([]int, 0)
		for n, c := range inDegree {
			if c == 0 {
				queue = append(queue, n)
				delete(inDegree, n)
			}
		}
		if len(queue) == 0 {
			return nil
		}
		for _, t := range queue {
			out = append(out, t)
			for _, path := range byVertex[t] {
				inDegree[path]--
			}
		}
	}
	return out
}
