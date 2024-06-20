package o.mg

import kotlin.math.abs

class `Detect Squares` {
    private val points = mutableMapOf<Point, Int>()

    fun add(point: IntArray) {
        points[Point(point[0], point[1])] = points.getOrDefault(Point(point[0], point[1]), 0) + 1
    }

    fun count(point: IntArray): Int {
        var acc = 0
        points.keys.forEach {
            val xDiff = abs(it.x - point[0])
            val yDiff = abs(it.y - point[1])
            if (xDiff != 0 && xDiff == yDiff && points.contains(Point(point[0], it.y)) && points.contains(
                    Point(
                        it.x,
                        point[1]
                    )
                )
            ) {
                acc += (points.getOrDefault(Point(point[0], it.y), 0) * points.getOrDefault(
                    Point(it.x, point[1]),
                    0
                ) * points.getOrDefault(it, 0))
            }
        }
        return acc
    }
}