import o.mg.TreeNode
import o.mg.sortedArrayToBST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class `Convert Sorted Array to Binary Search Tree Test` {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    fun testSortedArrayToBST(nums: IntArray, expected: TreeNode?) {
        val result = sortedArrayToBST(nums)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun provideTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(-10, -3, 0, 5, 9), testCase1()),
                Arguments.of(intArrayOf(1, 3), testCase2()),
            )
        }

        private fun testCase1(): TreeNode? {
            val root = TreeNode(0)
            root.left = TreeNode(-10)
            root.right = TreeNode(5)
            root.left!!.right = TreeNode(-3)
            root.right!!.right = TreeNode(9)
            return root
        }

        private fun testCase2(): TreeNode? {
            val root = TreeNode(1)
            root.right = TreeNode(3)
            return root
        }
    }
}