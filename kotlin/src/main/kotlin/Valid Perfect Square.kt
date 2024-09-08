package o.mg

fun isPerfectSquare(num: Int): Boolean {
    var r = 0L
    var l = num.toLong()
    while (r <= l) {
        val mid = r + (l-r)/2
        when {
            mid * mid > num -> {
                l = mid - 1
            }
            mid * mid < num -> {
                r = mid + 1
            }
            else -> return true
        }
    }
    return false
}