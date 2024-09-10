package solutions

func SingleNumber(nums []int) int {
	var r int
	for _, n := range nums {
		r ^= n
	}
	return r
}
