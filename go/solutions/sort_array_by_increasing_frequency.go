package solutions

import "sort"

func FrequencySort(nums []int) []int {
	frequency := make(map[int]int)
	n := len(nums)
	if n == 1 {
		return nums
	}
	for i := 0; i < n; i++ {
		frequency[nums[i]]++
	}
	sort.Slice(nums, func(i, j int) bool {
		if frequency[nums[i]] == frequency[nums[j]] {
			return nums[i] > nums[j]
		}
		return frequency[nums[i]] < frequency[nums[j]]
	})
	return nums
}
