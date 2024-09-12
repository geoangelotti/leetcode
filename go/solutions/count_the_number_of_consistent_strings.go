package solutions

func CountConsistentStrings(allowed string, words []string) int {
	var c int
	allows := make([]rune, 26)
	for _, c := range allowed {
		allows[c-'a'] = 1
	}
	for _, word := range words {
		consistent := true
		for _, c := range word {
			if allows[c-'a'] == 0 {
				consistent = false
			}
		}
		if consistent {
			c += 1
		}
	}
	return c
}
