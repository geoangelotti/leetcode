package o.mg

import kotlin.math.abs

fun fractionAddition(expression: String): String {
    var numerator = 0
    var denominator = 1
    var i = 0
    while (i < expression.length) {
        var sign = 1
        if (expression[i] == '+' || expression[i] == '-') {
            sign = if (expression[i] == '+') 1 else -1
            i++
        }
        var numStart = i
        while (expression[i] != '/') i++
        val currentNumerator = sign * expression.substring(numStart, i).toInt()
        i++
        numStart = i
        while (i < expression.length && expression[i].isDigit()) i++
        val currentDenominator = expression.substring(numStart, i).toInt()
        numerator = numerator * currentDenominator + currentNumerator * denominator
        denominator *= currentDenominator
        val gcd = gcd(abs(numerator), denominator)
        numerator /= gcd
        denominator /= gcd
    }
    return "$numerator/$denominator"
}

private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}