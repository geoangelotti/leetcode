package solutions

func HammingWeight(n int) int {
	var count int
	for n > 0 {
		count += int(n & 1)
		n >>= 1
	}
	return (count)
}
