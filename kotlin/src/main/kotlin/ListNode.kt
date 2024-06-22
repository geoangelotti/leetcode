package o.mg

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun equals(other: Any?): Boolean {
        if (other !is ListNode?) {
            return false
        }
        if (other == null) return true
        if ( this.`val` == other.`val`) {
            return this.next == other.next
        }
        return false
    }
}