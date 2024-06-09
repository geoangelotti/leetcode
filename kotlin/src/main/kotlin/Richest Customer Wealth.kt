package o.mg

fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.map { it.sum() }.max()
}