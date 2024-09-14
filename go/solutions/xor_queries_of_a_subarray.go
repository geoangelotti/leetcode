package solutions

func XorQueries(arr []int, queries [][]int) []int {
	if arr == nil {
		return nil
	}
	prefix := make([]int, 0)
	prefix = append(prefix, arr[0])

	for i := 1; i < len(arr); i++ {
		prefix = append(prefix, arr[i]^prefix[i-1])
	}
	res := make([]int, 0)
	for _, query := range queries {
		start := query[0]
		end := query[1]
		if start == 0 {
			res = append(res, prefix[end])
		} else {
			res = append(res, prefix[end]^prefix[start-1])
		}
	}
	return res
}
