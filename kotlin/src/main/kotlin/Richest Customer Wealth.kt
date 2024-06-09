package o.mg

fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.maxOfOrNull { it.sum() }!!
}