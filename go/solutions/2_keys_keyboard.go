package solutions

func MinSteps(n int) int {
	if n == 1 {
		return 0
	}
	totalOperations := 0
	for factor := 2; factor*factor <= n; factor++ {
		for n%factor == 0 {
			totalOperations += factor
			n /= factor
		}
	}
	if n > 1 {
		totalOperations += n
	}
	return totalOperations
}
