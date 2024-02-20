package o.mg

private fun digits(n: Int): List<Int> {
    val array = mutableListOf<Int>()
    var n = n
    var r = n
    while (n >= 1) {
        r = n % 10
        n /= 10
        array.add(r)
    }
    if (array.isEmpty()) {
        array.add(r)
    }
    return array.asReversed()
}

private fun isHappyMore(n: Int, s: MutableSet<Int>): Boolean {
    if (s.contains(n)) {
        return false
    }
    s.add(n)
    val digits = digits(n).sumOf { it * it }
    if (digits == 1) {
        return true
    }
    return isHappyMore(digits, s)
}

fun isHappy(n: Int): Boolean {
    return isHappyMore(n, mutableSetOf())
}

