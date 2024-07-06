package o.mg

fun passThePillow(n: Int, time: Int): Int {
    if (time < n) return time + 1
    val allCountPasses = time % (n - 1)
    val lastPass = time / (n - 1)
    return when {
        lastPass % 2 == 1 -> n - allCountPasses
        else -> 1 + allCountPasses

    }
}