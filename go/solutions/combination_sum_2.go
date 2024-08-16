package solutions

import "slices"

func CombinationSum2(candidates []int, target int) [][]int {
	slices.Sort(candidates)
	ans := make([][]int, 0, 1000)
	combo := make([]int, 0, len(candidates))
	var backtrack func(ans *[][]int, combo *[]int, candidates []int, target int, i int)
	backtrack = func(ans *[][]int, combo *[]int, candidates []int, target int, i int) {
		if target < 0 {
			return
		}
		if target == 0 {
			comboCopy := make([]int, len(*combo))
			copy(comboCopy, *combo)
			*ans = append(*ans, comboCopy)
			return
		}
		for j := i; j < len(candidates); j++ {
			if j > i && candidates[j] == candidates[j-1] {
				continue
			}
			*combo = append(*combo, candidates[j])
			backtrack(ans, combo, candidates, target-candidates[j], j+1)
			*combo = (*combo)[0 : len(*combo)-1]
		}
	}
	backtrack(&ans, &combo, candidates, target, 0)
	return ans
}
