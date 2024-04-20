package o.mg

fun hammingWeight(n: Int): Int {
    var count = 0
    var number = n
    while (number > 0) {
        count += number and 1
        number = number shr 1
    }
    return count
}