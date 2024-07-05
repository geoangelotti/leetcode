package o.mg

fun nodesBetweenCriticalPoints(head: ListNode?): IntArray {
    val criticalPoints = mutableListOf<Int>()
    var idx = 1
    var previous = head
    var current = previous?.next
    var next = current?.next
    while (next != null) {
        if ((current!!.`val` < previous!!.`val` && current.`val` < next.`val`)
            || (current.`val` > previous.`val` && current.`val` > next.`val`)
        ) {
            criticalPoints.add(idx)
        }
        ++idx
        previous = current
        current = next
        next = next.next
    }
    if (criticalPoints.size < 2) return intArrayOf(-1, -1)
    val maxDistance = criticalPoints.last() - criticalPoints.first()
    var minDistance = Int.MAX_VALUE
    for (i in 1..criticalPoints.lastIndex) {
        val distance = criticalPoints[i] - criticalPoints[i - 1]
        minDistance = minOf(distance, minDistance)
    }
    return intArrayOf(minDistance, maxDistance)
}