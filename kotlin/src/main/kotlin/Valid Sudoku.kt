package o.mg

fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (j in 0..<9) {
        val seenHorizontal = mutableSetOf<Char>()
        val seenVertical = mutableSetOf<Char>()
        for (i in 0..<9) {
            val itemHorizontal = board[j][i]
            if (itemHorizontal != '.') {
                if (seenHorizontal.contains(itemHorizontal)) {
                    return false
                }
                seenHorizontal.add(itemHorizontal)
            }
            val itemVertical = board[i][j]
            if (itemVertical != '.') {
                if (seenVertical.contains(itemVertical)) {
                    return false
                }
                seenVertical.add(itemVertical)
            }
        }
    }
    val starts = listOf(
        Pair(0, 0),
        Pair(3, 0),
        Pair(6, 0),
        Pair(0, 3),
        Pair(3, 3),
        Pair(6, 3),
        Pair(0, 6),
        Pair(3, 6),
        Pair(6, 6)
    )
    for ((i, j) in starts) {
        val seen = mutableSetOf<Char>()
        for (j2 in 0..2) {
            for (i2 in 0..2) {
                val item = board[j + j2][i + i2]
                if (item != '.') {
                    if (seen.contains(item)) {
                        return false
                    }
                    seen.add(item)
                }
            }
        }
    }
    return true
}