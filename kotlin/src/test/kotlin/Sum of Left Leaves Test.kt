import o.mg.TreeNode
import o.mg.sumOfLeftLeaves
import kotlin.test.Test
import kotlin.test.assertEquals

class `Sum of Left Leaves Test` {
    @Test
    fun case1() {
        val l7 = TreeNode(7)
        val l15 = TreeNode(15)
        val n20 = TreeNode(20)
        n20.left = l15
        n20.right = l7
        val l9 = TreeNode(9)
        val n3 = TreeNode(3)
        n3.left = l9
        n3.right = n20
        val result = sumOfLeftLeaves(n3)
        assertEquals(result, 24)
    }

    @Test
    fun case2() {
        val root = TreeNode(1)
        val result = sumOfLeftLeaves(root)
        assertEquals(result, 0)
    }


}