package solutions

import "sort"

func SurvivedRobotsHealths(positions []int, healths []int, directions string) []int {
	robots := make(map[int][]int)
	for i, position := range positions {
		direction := 1
		if directions[i] == 'L' {
			direction = -1
		}
		robots[position] = []int{healths[i], direction, i}
	}
	sortedPositions := append([]int{}, positions...)
	sort.Ints(sortedPositions)
	stack := [][]int{}
	for _, position := range sortedPositions {
		stack = append(stack, robots[position])
		i := len(stack) - 1
		for i-1 >= 0 && stack[i][1] == -1 && stack[i-1][1] == 1 {
			right := stack[i-1]
			left := stack[i]
			survive := []int{}
			stack = stack[:i-1]
			if left[0] > right[0] {
				survive = left
			} else if left[0] < right[0] {
				survive = right
			} else {
				i -= 2
				continue
			}
			survive[0]--
			stack = append(stack, survive)
			i--
		}
	}
	sort.Slice(stack, func(i, j int) bool {
		return stack[i][2] < stack[j][2]
	})
	result := []int{}
	for _, robot := range stack {
		result = append(result, robot[0])
	}
	return result
}
