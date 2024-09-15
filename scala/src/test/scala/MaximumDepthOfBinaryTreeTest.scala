import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class MaximumDepthOfBinaryTreeTest extends AnyFlatSpec with TableDrivenPropertyChecks with Matchers {
  "maxDepth" should "return the maximum depth of a binary tree" in {
    val testData = Table(
      ("root", "expected"),
      (TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))), 3),
      (TreeNode(1, null, TreeNode(2)), 2)
    )

    forAll(testData) { (root: TreeNode, expected: Int) =>
      val result = maxDepth(root)
      result should be(expected)
    }
  }
}
