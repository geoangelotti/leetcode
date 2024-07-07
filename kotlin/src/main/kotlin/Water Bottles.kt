package o.mg

fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
    var acc = numBottles
    var empty = numBottles
    while (empty >= numExchange) {
        acc += empty / numExchange
        empty = empty % numExchange + empty / numExchange
    }
    return acc
}