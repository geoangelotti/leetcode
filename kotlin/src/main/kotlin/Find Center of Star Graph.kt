package o.mg

fun findCenter(edges: Array<IntArray>): Int {
    val nodes = mutableMapOf<Int, MutableSet<Int>>()
    edges.forEach {
        val (n1, n2) = it
        nodes.getOrPut(n1) { mutableSetOf(n2) }.add(n2)
        nodes.getOrPut(n2) { mutableSetOf(n1) }.add(n1)
    }
    return nodes.asSequence().sortedByDescending { it.value.size }.first().key
}