import o.mg.TreeNode
import o.mg.sumOfLeftLeaves
import kotlin.test.Test
import kotlin.test.assertEquals

class `Sum of Left Leaves Test` {
    @Test
    fun case1() {
        val n7 = TreeNode(7)
        val n15 = TreeNode(15)
        val n20 = TreeNode(20)
        n20.left = n15
        n20.right = n7
        val n9 = TreeNode(9)
        val n3 = TreeNode(3)
        n3.left = n9
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