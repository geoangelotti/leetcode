import o.mg.TreeNode
import o.mg.createBinaryTree
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Create Binary Tree From Descriptions Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testCreateBinaryTree(descriptions: Array<IntArray>, expected: TreeNode?) {
        val result = createBinaryTree(descriptions)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf(
                        intArrayOf(20, 15, 1),
                        intArrayOf(20, 17, 0),
                        intArrayOf(50, 20, 1),
                        intArrayOf(50, 80, 0),
                        intArrayOf(80, 19, 1)
                    ), case1TreeNode()
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(1, 2, 1),
                        intArrayOf(2, 3, 0),
                        intArrayOf(3, 4, 1),
                        ), case1TreeNode()
                )
            )
        }

        private fun case1TreeNode(): TreeNode {
            val n80 = TreeNode(80)
            n80.left = TreeNode(19)
            val n20 = TreeNode(20)
            n20.left = TreeNode(15)
            n20.right = TreeNode(17)
            val n50 = TreeNode(50)
            n50.left = n20
            n50.right = n80
            return n50
        }

        private fun case2TreeNode(): TreeNode {
            val n3 = TreeNode(3)
            n3.left = TreeNode(4)
            val n2 = TreeNode(2)
            n2.right = n3
            val n1 = TreeNode(1)
            n1.left = n2
            return n1
        }
    }
}