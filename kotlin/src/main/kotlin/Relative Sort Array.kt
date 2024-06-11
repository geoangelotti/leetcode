package o.mg

fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    val frequencies = arr1.toList().groupingBy { it }.eachCount()
    val set = arr2.toSet()
    val result = mutableListOf<Int>()
    val rest = arr1.filter { it !in set }.sorted()
    arr2.forEach {
        val frequency = frequencies[it]!!
        for (i in 0..<frequency) {
            result.add(it)
        }
    }
    result.addAll(rest)
    return result.toIntArray()
}