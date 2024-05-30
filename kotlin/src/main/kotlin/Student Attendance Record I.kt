package o.mg

fun checkRecord(s: String): Boolean {
    val absent = s.count { it == 'A' } < 2
    val late = s.windowed(3).count { it == "LLL" } < 1
    return absent && late
}