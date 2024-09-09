package o.mg

fun addDigits(num: Int): Int {
    var n = num
    while (n > 9) {
        n = n.toString().sumOf { it.digitToInt() }
    }
    return n
}