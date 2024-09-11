package o.mg

fun mySqrt(x: Int): Int {
    if (x == 0 || x == 1) return x
    var l = 1
    var r = x
    while (l <= r) {
        val mid = l + (r - l) / 2
        if (mid.toLong() * mid > x.toLong()) r = mid - 1
        else if (mid * mid == x)
            return mid
        else
            l = mid + 1
    }
    return r
}