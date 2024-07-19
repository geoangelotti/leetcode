package o.mg

fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
    val minRow = IntArray(matrix.size) { Int.MAX_VALUE }
    val maxCol = IntArray(matrix[0].size) { 0 }
    val res = mutableListOf<Int>()
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            minRow[i] = minOf(matrix[i][j], minRow[i])
            maxCol[j] = maxOf(matrix[i][j], maxCol[j])
        }
    }
    println(minRow.toList())
    println(maxCol.toList())
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                res.add(matrix[i][j])
            }
        }
    }
    return res
}