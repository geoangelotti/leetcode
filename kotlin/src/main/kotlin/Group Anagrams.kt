package o.mg

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res = mutableMapOf<Map<Char, Int>,MutableList<String>>()
    for (s in strs) {
        val entry = s.groupingBy { it }.eachCount()
        val lookup = res[entry]
        if (lookup == null) {
            res[entry] = mutableListOf(s)
        } else {
            lookup.add(s)
        }
    }
    return res.values.toList()
}
