package solutions

func MaxDistance(arrays [][]int) int {
	if len(arrays) < 2 {
		return 0
	}

	globalMin, globalMax := arrays[0][0], arrays[0][len(arrays[0])-1]
	result := 0

	for _, arr := range arrays[1:] {
		localMin, localMax := arr[0], arr[len(arr)-1]
		result = max(result, max(localMax-globalMin, globalMax-localMin))
		globalMin = min(globalMin, localMin)
		globalMax = max(globalMax, localMax)
	}

	return result
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
