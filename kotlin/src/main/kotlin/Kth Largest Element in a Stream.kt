package o.mg

import java.util.PriorityQueue

class KthLargest(private val k: Int, nums: IntArray) {
    private val kSmallest = PriorityQueue<Int>()

    init {
        for (num in nums) {
            add(num)
        }
    }

    fun add(`val`: Int): Int {
        kSmallest.offer(`val`)
        if (kSmallest.size > k) {
            kSmallest.poll()
        }
        return kSmallest.peek()
    }
}