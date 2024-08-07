package o.mg

fun numberToWords(num: Int): String {
    if (num == 0) return "Zero"
    fun decode(n: Int): String {
        return when {
            n == 0 -> ""
            n < 20 -> LESS_THAN_20[n] + " "
            n < 100 -> TENS[n / 10] + " " + decode(n % 10)
            else -> LESS_THAN_20[n / 100] + " Hundred " + decode(n % 100)
        }
    }

    var n = num
    var i = 0
    var words = ""
    while (n > 0) {
        if (n % 1000 != 0) {
            words = decode(n % 1000) + THOUSANDS[i] + " " + words
        }
        n /= 1000
        i++
    }
    return words.trim()
}

private val LESS_THAN_20 = arrayOf(
    "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
    "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
    "Seventeen", "Eighteen", "Nineteen"
)

private val TENS = arrayOf("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")

private val THOUSANDS = arrayOf("", "Thousand", "Million", "Billion")