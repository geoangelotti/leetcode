package o.mg

fun minOperations(logs: Array<String>): Int {
    var distance =0
    logs.forEach {
        if (it == "../") {
            if (distance != 0) {
                distance -= 1
            }
        } else if (it != "./") {
            distance += 1
        }
    }
    return distance
}