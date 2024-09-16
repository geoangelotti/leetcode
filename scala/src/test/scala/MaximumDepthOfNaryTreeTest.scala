import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class MaximumDepthOfNaryTreeTest extends AnyFlatSpec with TableDrivenPropertyChecks with Matchers {
  "maxDepth" should "return the maximum depth of a n-ary tree" in {
    val testData = Table(
      ("root", "expected"),
      (case1(), 3),
      (case2(), 5)
    )

    forAll(testData) { (root: Node, expected: Int) =>
      val result = maxDepth(root)
      result should be(expected)
    }
  }

  def case1(): Node = {
    val root = Node(1)
    val n3 = Node(3)
    n3.children = List(Node(5), Node(6))
    root.children = List(n3, Node(2), Node(4))
    root
  }

  def case2(): Node = {
    val root = Node(1)
    val n9 = Node(9)
    n9.children = List(Node(13))
    val n5 = Node(5)
    n5.children = List(n9, Node(10))
    val n8 = Node(8)
    n8.children = List(Node(12))
    val n4 = Node(4)
    n4.children = List(n8)
    val n11 = Node(11)
    n11.children = List(Node(14))
    val n7 = Node(7)
    n7.children = List(n11)
    val n3 = Node(3)
    n3.children = List(Node(6), n7)
    root.children = List(Node(2), n3, n4, n5)
    root
  }
}