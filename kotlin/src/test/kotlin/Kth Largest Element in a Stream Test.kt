import o.mg.KthLargest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Kth Largest Element in a Stream Test` {
    @Test
    fun testKthLargest() {
        val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))
        assertEquals(kthLargest.add(3), 4)
        assertEquals(kthLargest.add(5), 5)
        assertEquals(kthLargest.add(10), 5)
        assertEquals(kthLargest.add(9), 8)
        assertEquals(kthLargest.add(4), 8)

    }
}