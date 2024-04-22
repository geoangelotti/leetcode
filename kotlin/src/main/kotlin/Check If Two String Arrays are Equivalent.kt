package o.mg

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    return word1.joinTo(StringBuilder(), separator = "").toString() == word2.joinTo(StringBuilder(), separator = "")
        .toString()
}
