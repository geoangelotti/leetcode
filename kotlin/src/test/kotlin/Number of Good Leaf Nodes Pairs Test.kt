import o.mg.TreeNode
import o.mg.countPairs
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Number of Good Leaf Nodes Pairs Test` {
    @ParameterizedTest
    @MethodSource("methodTestCases")
    fun testCountPairs(root: TreeNode, distance: Int, expected: Int) {
        val result = countPairs(root, distance)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun methodTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(testCase1(), 3, 1),
                Arguments.of(testCase2(), 3, 2),
                Arguments.of(testCase3(), 3, 1),
            )
        }

        private fun testCase1(): TreeNode {
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.right = TreeNode(3)
            root.left!!.right = TreeNode(4)
            return root
        }

        private fun testCase2(): TreeNode {
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.right = TreeNode(3)
            root.left!!.left = TreeNode(4)
            root.left!!.right = TreeNode(5)
            root.right!!.left = TreeNode(6)
            root.right!!.right = TreeNode(7)
            return root
        }

        private fun testCase3(): TreeNode {
            val root = TreeNode(7)
            root.left = TreeNode(1)
            root.right = TreeNode(4)
            root.left!!.left = TreeNode(6)
            root.right!!.left = TreeNode(5)
            root.right!!.right = TreeNode(3)
            root.right!!.right!!.right = TreeNode(2)
            return root
        }
    }
}