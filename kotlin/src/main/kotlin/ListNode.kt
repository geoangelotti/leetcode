package o.mg

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun equals(other: Any?): Boolean {
        if (other !is ListNode?) {
            return false
        }
        if (other == null) return true
        if (this === other) return true
        if (this.`val` == other.`val`) {
            return this.next == other.next
        }
        return false
    }

    constructor(list: List<Int>) : this(list.first()) {
        val v: ListNode? = list.reversed().fold(null) { acc: ListNode?, i ->
            val c = ListNode(i)
            c.next = acc
            c
        }
        this.next = v!!.next
    }
}