package o.mg

import java.util.*

fun countOfAtoms(formula: String): String {
    var i = 0
    fun count(): Int {
        if (i > formula.lastIndex || !formula[i].isDigit()) return 1
        val from = i
        while (i < formula.length && formula[i].isDigit()) i++
        return formula.substring(from, i).toInt()
    }
    fun dfs(): Map<String, Int> = TreeMap<String, Int>().apply {
        while (i < formula.length) if (formula[i] == ')') break
        else if (formula[i] == '(') {
            i++
            val inBrackets = dfs()
            i++
            val count = count()
            for ((name, c) in inBrackets) this[name] = c * count + (this[name] ?: 0)
        } else {
            val from = i++
            while (i < formula.length && formula[i].isLowerCase()) i++
            val name = formula.substring(from, i)
            this[name] = count() + (this[name] ?: 0)
        }
    }
    return dfs().entries.joinToString("") { it.run { if (value > 1) "$key$value" else key } }
}
