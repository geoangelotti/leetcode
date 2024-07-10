package o.mg

fun averageWaitingTime(customers: Array<IntArray>): Double {
    var finishTime = 1
    var acc = 0L
    for ((arrival, time) in customers) {
        if (arrival > finishTime) {
            finishTime = arrival + time
        } else {
            finishTime += time
        }
        acc += finishTime - arrival
    }
    return acc.toDouble() / customers.size
}