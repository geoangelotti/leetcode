package o.mg

fun findTheDifference(s: String, t: String): Char {
    var result = 0
    s.forEachIndexed { index, c ->
        result = result xor c.code
        result = result xor t[index].code
    }
    result = result xor t.last().code
    return result.toChar()
}