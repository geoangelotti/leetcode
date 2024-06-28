package o.mg

fun maxDistance(position: IntArray, m: Int): Int {
    position.sort()
    var l = 0;
    var r = Int.MAX_VALUE
    while (l <= r) {
        val mid = l + (r - l) / 2
        var count = 0;
        var next = 1
        for (p in position)
            if (p >= next) {
                count++; next = p + mid
            }
        if (count >= m) l = mid + 1 else r = mid - 1
    }
    return r
}