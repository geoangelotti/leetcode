package solutions

func RestoreMatrix(rowSum []int, colSum []int) [][]int {
	res := make([][]int, len(rowSum))
	for i := 0; i < len(rowSum); i++ {
		for j := 0; j < len(colSum); j++ {
			curRow := rowSum[i]
			curCol := colSum[j]
			if len(res[i]) == 0 {
				res[i] = make([]int, len(colSum))
			}
			if curRow < curCol {
				res[i][j] = curRow
				colSum[j] -= curRow
				rowSum[i] = 0
			} else {
				res[i][j] = curCol
				rowSum[i] -= curCol
				colSum[j] = 0
			}
		}
	}
	return res
}
