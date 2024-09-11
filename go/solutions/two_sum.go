package solutions

func TwoSum(nums []int, target int) []int {
	var indexes = make(map[int]int)
	for i, value := range nums {
		diff := target - value
		v, exists := indexes[diff]
		if exists {
			ret := [2]int{0, 0}
			ret[0] = v
			ret[1] = i
			return ret[:]
		}
		indexes[value] = i
	}
	return []int{}
}
