package solutions

func mergeArrays(nums1 []int, nums2 []int) []int {
	final := []int{}
	i := 0
	j := 0
	for i < len(nums1) && j < len(nums2) {
		if nums1[i] < nums2[j] {
			final = append(final, nums1[i])
			i++
		} else {
			final = append(final, nums2[j])
			j++
		}
	}
	for ; i < len(nums1); i++ {
		final = append(final, nums1[i])
	}
	for ; j < len(nums2); j++ {
		final = append(final, nums2[j])
	}
	return final
}

func FindMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	length := len(nums1) + len(nums2)
	middle := length / 2
	acc := mergeArrays(nums1, nums2)
	if length == 0 {
		return 0.0
	}
	if length == 1 {
		return float64(acc[middle])
	}
	if length%2 == 1 {
		return float64(acc[middle])
	}
	return (float64(acc[middle]) + float64(acc[middle-1])) / 2.0
}
