import o.mg.TreeNode
import o.mg.postorderTraversal
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Binary Tree Postorder Traversal Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testPostorderTraversal(root: TreeNode?, expected: List<Int>) {
        val result = postorderTraversal(root)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(case1TreeNode(), listOf(3, 2, 1)),
                Arguments.of(null, listOf<Int>()),
                Arguments.of(TreeNode(1), listOf(1)),
            )
        }

        private fun case1TreeNode(): TreeNode {
            val n2 = TreeNode(2)
            n2.left = TreeNode(3)
            val n1 = TreeNode(1)
            n1.right = n2
            return n1
        }
    }
}