package o.mg

fun delNodes(root: TreeNode?, to_delete: IntArray): List<TreeNode?> =
    buildList {
        val set = to_delete.toSet()
        fun dfs(n: TreeNode?): TreeNode? = n?.run {
            left = dfs(left); right = dfs(right);
            val remove = `val` in set
            if (remove) {
                left?.let(::add); right?.let(::add)
            }
            takeIf { !remove }
        }
        dfs(root)?.let(::add)
    }