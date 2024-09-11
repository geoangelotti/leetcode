package solutions

func MinBitFlips(start int, goal int) int {
	n := start ^ goal
	var count int
	for n > 0 {
		count += (n & 1)
		n >>= 1
	}
	return count
}
