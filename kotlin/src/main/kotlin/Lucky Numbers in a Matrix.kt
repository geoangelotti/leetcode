package o.mg

fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
    val maxs = mutableMapOf<Pair<Int,Int>, Int>()
    val mins = mutableMapOf<Pair<Int,Int>, Int>()
    val n = matrix.size
    val m = matrix[0].size
    for (row in 0..<n) {
        var minPosition = Pair(0,row)
        var min = matrix[row][0]
        for (col in 0..<m) {
            if (matrix[row][col] < min) {
                minPosition = Pair(col,row)
                min = matrix[row][col]
            }
        }
        mins[minPosition] = min
    }
    for (col in 0..<m) {
        var maxPosition = Pair(col,0)
        var max = matrix[0][col]
        for (row in 0..<n) {
            if (matrix[row][col] > max) {
                maxPosition = Pair(col,row)
                max = matrix[row][col]
            }
        }
        maxs[maxPosition] = max
    }
    return mins.keys.intersect(maxs.keys).toList().map { mins[it]!! }
}