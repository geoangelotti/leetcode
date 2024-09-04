package o.mg

fun getDirections(root: TreeNode?, startValue: Int, destValue: Int): String {
    fun down(n: TreeNode?, v: Int, sb: StringBuilder = StringBuilder()): String = n?.run {
        if (`val` == v) sb.toString() else {
            sb.append('L');
            val l = down(left, v, sb)
            if (l != "") l else {
                sb.deleteAt(sb.lastIndex); sb.append('R')
                down(right, v, sb).also { sb.deleteAt(sb.lastIndex) }
            }
        }
    } ?: ""
    val s = down(root, startValue);
    val d = down(root, destValue)
    val skip = s.commonPrefixWith(d).length
    return "U".repeat(s.length - skip) + d.drop(skip)
}