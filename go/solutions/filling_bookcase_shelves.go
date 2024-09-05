package solutions

import "math"

func MinHeightShelves(books [][]int, shelfWidth int) int {
	memo := map[int]int{}
	return recursiveLibrary(books, shelfWidth, memo)
}

func recursiveLibrary(books [][]int, shelfWidth int, memo map[int]int) int {
	if len(books) == 0 {
		return 0
	}
	if v, ok := memo[len(books)]; ok {
		return v
	}
	h := 0
	ans := math.MaxInt
	w := 0
	for i := range books {
		w += books[i][0]
		if w > shelfWidth {
			break
		}
		h = max(h, books[i][1])
		ans = min(ans, h+recursiveLibrary(books[i+1:], shelfWidth, memo))
	}
	memo[len(books)] = ans
	return ans
}
