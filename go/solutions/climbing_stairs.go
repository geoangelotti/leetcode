package solutions

func ClimbStairs(n int) int {
	var a, b int
	a = 1
	b = 1
	for i := 0; i < n-1; i++ {
		temp := a
		a = a + b
		b = temp
	}
	return a
}
