package o.mg

fun isPalindrome(s: String): Boolean {
    val clean = s.filter { it.isLetter() || it.isDigit() }
    for (i in 0..<(clean.length / 2)) {
        if (clean[i].lowercaseChar() != clean[clean.length - 1 - i].lowercaseChar()) {
            return false
        }
    }
    return true
}