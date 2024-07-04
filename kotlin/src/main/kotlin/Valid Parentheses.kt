package o.mg

fun isValid(s: String): Boolean {
    val map = mapOf('(' to ')', '[' to ']', '{' to '}')
    val acc = ArrayDeque<Char>()
    for (c in s) {
        if (acc.size == 0) {
            acc.add(c)
        } else if (map[acc.last()] == c) {
            acc.removeLast()
        } else {
            acc.add(c)
        }
    }
    return acc.isEmpty()
}