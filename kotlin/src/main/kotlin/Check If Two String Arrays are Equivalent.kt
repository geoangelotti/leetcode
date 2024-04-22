package o.mg

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    return word1.joinToString(separator = "") == word2.joinToString(separator = "")
}
