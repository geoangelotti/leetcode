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
        assertEquals(24, result)
    }

    @Test
    fun case2() {
        val root = TreeNode(1)
        val result = sumOfLeftLeaves(root)
        assertEquals(0, result)
    }

    @Test
    fun case3() {
        val n1 = TreeNode(1)
        val l5 = TreeNode(5)
        n1.left = l5
        val l1 = TreeNode(1)
        n1.right = l1
        val n3 = TreeNode(3)
        val l6 = TreeNode(6)
        n3.right = l6
        val `n-1` = TreeNode(-1)
        val l8 = TreeNode(8)
        `n-1`.right = l8
        val n2 = TreeNode(2)
        n2.left = n1
        val n4 = TreeNode(4)
        n4.left = n3
        n4.right = `n-1`
        val n0 = TreeNode(0)
        n0.left = n2
        n0.right = n4
        val result = sumOfLeftLeaves(n0)
        assertEquals(5, result)
    }
}