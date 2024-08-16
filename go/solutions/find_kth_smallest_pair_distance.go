package solutions

import "sort"

func SmallestDistancePair(nums []int, k int) int {
	sort.Ints(nums)
	low, high := 0, nums[len(nums)-1]-nums[0]
	countPairs := func(nums []int, distance int) int {
		count, left := 0, 0
		for right := 1; right < len(nums); right++ {
			for nums[right]-nums[left] > distance {
				left++
			}
			count += right - left
		}
		return count
	}
	for low < high {
		mid := low + (high-low)/2
		if countPairs(nums, mid) < k {
			low = mid + 1
		} else {
			high = mid
		}
	}

	return low
}
