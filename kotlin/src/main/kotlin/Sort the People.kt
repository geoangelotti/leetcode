package o.mg

fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    return names.zip(heights.map { it.toString() }).sortedByDescending { it.second.toInt() }.map { it.first }
        .toTypedArray()
}