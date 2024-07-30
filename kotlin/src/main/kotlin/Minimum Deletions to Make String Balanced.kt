package o.mg

fun minimumDeletions(s: String): Int {
    var deletions = 0
    var counts = 0
    for (ch in s) {
        if (ch == 'b') {
            counts += 1
        } else if (counts > 0) {
            deletions += 1
            counts -= 1
        }
    }
    return deletions
}