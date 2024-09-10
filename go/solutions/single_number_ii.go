package solutions

func SingleNumberII(nums []int) int {
	m := make(map[int]int)
	for _, v := range nums {
		s := m[v]
		s++
		m[v] = s
	}
	for k, v := range m {
		if v == 1 {
			return k
		}
	}
	return 0
}
