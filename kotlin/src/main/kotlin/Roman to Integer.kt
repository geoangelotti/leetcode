package o.mg

val romanToInt = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000,
)

fun romanToInt(s: String): Int {
    val t = s.mapNotNull { romanToInt[it] }
    var i = 0
    var j = 0
    var acc = 0
    while (i < t.size) {
        j = i + 1
        val current = t[i]
        if (j > t.size - 1) {
            acc += current
            i += 1
            continue
        }
        val next = t[j]
        if (next > current) {
            acc = acc + next - current
            i += 2
            continue
        }
        acc += current
        i += 1
    }
    return acc
}