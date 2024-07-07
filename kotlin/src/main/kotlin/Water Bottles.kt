package o.mg

fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
    return numBottles + ((numBottles - 1) / (numExchange - 1))
}