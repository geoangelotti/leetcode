package o.mg

fun strangePrinter(s: String): Int {
    if (s.isEmpty()) return 0
    val filteredChars = mutableListOf<Char>()
    for (c in s) {
        if (filteredChars.isEmpty() || c != filteredChars.last()) {
            filteredChars.add(c)
        }
    }
    val m = filteredChars.size
    val dp = Array(m) { IntArray(m) }
    for (i in 0 until m) {
        dp[i][i] = 1
    }
    val lastSeen = mutableMapOf<Char, Int>()
    val nextOccurrence = IntArray(m) { -1 }
    for (i in m - 1 downTo 0) {
        val c = filteredChars[i]
        nextOccurrence[i] = lastSeen[c] ?: -1
        lastSeen[c] = i
    }
    for (length in 2..m) {
        for (start in 0..m - length) {
            val end = start + length - 1
            dp[start][end] = dp[start + 1][end] + 1
            var nextPos = nextOccurrence[start]
            while (nextPos != -1 && nextPos <= end) {
                dp[start][end] = minOf(dp[start][end], dp[start][nextPos - 1] + if (nextPos + 1 <= end) dp[nextPos + 1][end] else 0)
                nextPos = nextOccurrence[nextPos]
            }
        }
    }
    return dp[0][m - 1]
}