import o.mg.TreeNode
import o.mg.isSameTree
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Same Tree Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testIsSameTree(p: TreeNode?, q: TreeNode?, expected: Boolean) {
        val result = isSameTree(p, q)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(testCase1(), testCase1(), true),
                Arguments.of(testCase2P(), testCase2Q(), false),
                Arguments.of(testCase3P(), testCase3Q(), false),
            )
        }

        private fun testCase1(): TreeNode {
            val head = TreeNode(1)
            head.left = TreeNode(2)
            head.right = TreeNode(3)
            return head
        }

        private fun testCase2P(): TreeNode {
            val head = TreeNode(1)
            head.left = TreeNode(2)
            return head
        }

        private fun testCase2Q(): TreeNode {
            val head = TreeNode(1)
            head.right = TreeNode(2)
            return head
        }

        private fun testCase3P(): TreeNode {
            val head = TreeNode(1)
            head.left = TreeNode(2)
            head.right = TreeNode(1)
            return head
        }

        private fun testCase3Q(): TreeNode {
            val head = TreeNode(1)
            head.left = TreeNode(1)
            head.right = TreeNode(2)
            return head
        }
    }
}