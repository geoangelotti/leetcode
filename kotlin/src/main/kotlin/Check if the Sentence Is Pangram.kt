package o.mg

fun checkIfPangram(sentence: String): Boolean {
    val map = IntArray(26) { 0 }
    sentence.forEach {
        map[it - 'a'] += 1
    }
    map.forEach {
        if (it == 0) {
            return false
        }
    }
    return true
}