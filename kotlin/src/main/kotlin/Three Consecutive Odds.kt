package o.mg

fun threeConsecutiveOdds(arr: IntArray): Boolean {
    var consecutive = 0
    for (num in arr) {
        if (num % 2 == 1) {
            consecutive += 1
        } else {
            consecutive = 0
        }
        if (consecutive == 3)
            return true
    }
    return false
}