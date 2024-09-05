package solutions

func Shuffle(nums []int, n int) []int {
	n1 := []int{}
	n2 := []int{}
	for i, v := range nums {
		if i < n {
			n1 = append(n1, v)
		} else {
			n2 = append(n2, v)
		}
	}
	res := []int{}
	for i := 0; i < n; i++ {
		res = append(res, n1[i])
		res = append(res, n2[i])
	}
	return res
}
