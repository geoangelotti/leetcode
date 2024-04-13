package o.mg

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val a = s.groupingBy { it }.eachCount()
    val b = t.groupingBy { it }.eachCount()
    return a == b
}