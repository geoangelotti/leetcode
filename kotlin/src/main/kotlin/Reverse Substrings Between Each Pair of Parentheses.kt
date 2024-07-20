package o.mg

fun reverseParentheses(s: String): String {
    val n = s.length
    var i = 0
    fun dfs(): StringBuilder = StringBuilder().apply {
        while (i < n && s[i] != ')') {
            if (s[i] == '(') {
                i += 1
                append(dfs().reverse())
            } else {
                append(s[i])
            }
            i += 1
        }
    }
    return dfs().toString()
}