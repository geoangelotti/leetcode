package solutions

func SingleNumberIII(nums []int) []int {
	res := []int{}
	m := make(map[int]int)
	for _, v := range nums {
		s := m[v]
		s++
		m[v] = s
	}
	for k, v := range m {
		if v == 1 {
			res = append(res, k)
		}
	}
	return res
}