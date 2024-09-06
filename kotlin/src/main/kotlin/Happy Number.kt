package o.mg

private fun digitsSquared(n: Int): Int {
   return n.toString().toCharArray().sumOf { it.digitToInt() * it.digitToInt() }
}

fun isHappy(n: Int): Boolean {
    if (n == 1) return true
    var slow = digitsSquared(n)
    var fast = digitsSquared(digitsSquared(n))
    while (slow != fast) {
        slow = digitsSquared(slow)
        fast = digitsSquared(digitsSquared(fast))
    }
    return slow == 1
}

