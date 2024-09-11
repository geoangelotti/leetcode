package o.mg

import kotlin.math.abs

fun reverse(x: Int): Int {
    val s = x.toString().filter { it.isDigit() }
    val reversed = s.reversed().toLong()
    if (abs(reversed) > Int.MAX_VALUE) {
        return 0
    }
    return ((if (x > 0) 1 else -1) * s.reversed().toLong()).toInt()
}