package solutions

func FindClosest(x int, y int, z int) int {
	abs := func(n int) int {
		if n < 0 {
			return -1 * n
		}
		return n
	}
	if abs(x-z) == abs(y-z) {
		return 0
	}
	if abs(x-z) > abs(y-z) {
		return 2
	}
	return 1
}
