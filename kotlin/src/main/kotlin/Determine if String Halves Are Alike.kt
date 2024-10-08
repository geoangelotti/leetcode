package o.mg

fun halvesAreAlike(s: String): Boolean {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val s1 = s.substring(0, s.length / 2)
    val s2 = s.substring(s.length / 2)
    return s1.count { vowels.contains(it.lowercaseChar()) } == s2.count { vowels.contains(it.lowercaseChar()) }
}