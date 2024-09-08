import o.mg.TreeNode
import o.mg.delNodes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Delete Nodes And Return Forest Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testDelNodes(root: TreeNode?, to_delete: IntArray, expected: List<TreeNode?>) {
        val result = delNodes(root, to_delete)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(testCase1Input(), intArrayOf(3,5), testCase1Output()),
                Arguments.of(testCase2Input(), intArrayOf(3,5), testCase2Output()),
            )
        }

        private fun testCase1Input(): TreeNode? {
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.right = TreeNode(3)
            root.left!!.left = TreeNode(4)
            root.left!!.right = TreeNode(5)
            root.right!!.left = TreeNode(6)
            root.right!!.right = TreeNode(7)
            return root
        }

        private fun testCase1Output(): List<TreeNode?> {
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.left!!.left = TreeNode(4)
            root.left!!.right = TreeNode(5)
            return listOf(root, TreeNode(6), TreeNode(7))
        }

        private fun testCase2Input(): TreeNode? {
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.right = TreeNode(4)
            root.left!!.right = TreeNode(3)
            return root
        }

        private fun testCase2Output(): List<TreeNode?> {
            val root = TreeNode(1)
            root.left = TreeNode(2)
            root.right = TreeNode(3)
            return listOf(root)
        }
    }
}