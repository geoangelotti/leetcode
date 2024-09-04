package solutions

import "fmt"

func RobotSim(commands []int, obstacles [][]int) int {
	directions := [][2]int{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}
	dirIndex := 0
	obstacleSet := make(map[string]struct{})
	for _, obstacle := range obstacles {
		key := fmt.Sprintf("%d,%d", obstacle[0], obstacle[1])
		obstacleSet[key] = struct{}{}
	}
	x, y := 0, 0
	maxDistance := 0
	for _, command := range commands {
		if command == -2 {
			dirIndex = (dirIndex + 3) % 4
		} else if command == -1 {
			dirIndex = (dirIndex + 1) % 4
		} else {
			for step := 0; step < command; step++ {
				newX := x + directions[dirIndex][0]
				newY := y + directions[dirIndex][1]
				key := fmt.Sprintf("%d,%d", newX, newY)
				if _, exists := obstacleSet[key]; exists {
					break
				}
				x, y = newX, newY
				maxDistance = max(maxDistance, x*x+y*y)
			}
		}
	}

	return maxDistance
}
