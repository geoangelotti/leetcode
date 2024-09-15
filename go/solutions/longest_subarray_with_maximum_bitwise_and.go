package solutions

func LongestSubarray(nums []int) int {
	max := nums[0]
	maxLength := 1
	length := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] > max {
			max = nums[i]
			maxLength = 1
			length = 1
		} else if nums[i] == max {
			length++
			if length > maxLength {
				maxLength = length
			}
		} else {
			length = 0
		}
	}
	return maxLength
}
