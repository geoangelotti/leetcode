package solutions

func LargestAltitude(gain []int) int {
	var highest, current int
	for _, g := range gain {
		current += g
		if current > highest {
			highest = current
		}
	}
	return highest
}
