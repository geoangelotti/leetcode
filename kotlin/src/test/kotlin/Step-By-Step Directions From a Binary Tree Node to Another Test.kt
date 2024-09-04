import o.mg.TreeNode
import o.mg.getDirections
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Step-By-Step Directions From a Binary Tree Node to Another Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testGetDirections(root: TreeNode?, startValue: Int, destValue: Int, expected: String) {
        val result = getDirections(root, startValue, destValue)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(case1TreeNode(), 3, 6, "UURL"),
                Arguments.of(case2TreeNode(), 2, 1, "L"),
            )
        }

        private fun case1TreeNode(): TreeNode? {
            val n1 = TreeNode(1)
            n1.left = TreeNode(3)
            val n2 = TreeNode(2)
            n2.left = TreeNode(6)
            n2.right = TreeNode(4)
            val n5 = TreeNode(5)
            n5.left = n1
            n5.right = n2
            return n5
        }

        private fun case2TreeNode(): TreeNode? {
            val n2 = TreeNode(2)
            n2.left = TreeNode(1)
            return n2
        }
    }
}