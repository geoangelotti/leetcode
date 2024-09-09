package o.mg

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null


    override fun toString(): String {
        if (this == null) {
            return "null"
        }
        return "<{${this.`val`}}, $left, $right>"
    }

    override fun equals(other: Any?): Boolean {
        println("$this, $other")
        if (other !is TreeNode?) {
            return false
        }
        if (this == null && other == null) return true
        if (this == null || other == null) return false
        if (this === other) return true
        if (this.`val` != other!!.`val`) return false
        return this.left == other.left && this.right == other.right
    }
}

