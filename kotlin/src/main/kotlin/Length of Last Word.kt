package o.mg

fun lengthOfLastWord(s: String): Int {
    return s.split(" ").last { it.isNotEmpty() && it.isNotBlank() }.length
}