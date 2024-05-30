package o.mg

fun checkRecord(s: String): Boolean {
    var absent = 0
    var late = 0
    s.forEach {
        when (it) {
            'P' -> late = 0
            'L' -> if (++late > 2) return false
            else -> {
                if (++absent > 1) return false
                late = 0
            }
        }
    }
    return true
}