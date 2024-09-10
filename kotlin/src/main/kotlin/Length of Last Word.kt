package o.mg

fun lengthOfLastWord(s: String): Int {
    return s.split(" ").filter{ !it.isEmpty() && !it.isBlank() }.last().length
}