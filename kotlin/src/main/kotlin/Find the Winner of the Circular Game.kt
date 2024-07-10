package o.mg

fun findTheWinner(n: Int, k: Int): Int {
    var winner = 0
    for (i in 1..n) {
        winner = (winner + k) % i
    }
    return winner + 1

}