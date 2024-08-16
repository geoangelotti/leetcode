package solutions

func LemonadeChange(bills []int) bool {
	var fives, tens, twentys int = 0, 0, 0
	for i := 0; i < len(bills); i++ {
		var change int = bills[i] - 5
		if change == 5 {
			fives--
		} else if change == 15 {
			if tens > 0 {
				tens--
				fives--
			} else {
				fives -= 3
			}
		}
		if fives < 0 {
			return false
		}
		switch bills[i] {
		case 5:
			fives++
		case 10:
			tens++
		case 20:
			twentys++
		}
	}
	return true
}
