import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks


class TwoSumTest extends AnyFlatSpec with TableDrivenPropertyChecks  with Matchers {
  "twoSum" should "return the indices of the two numbers that they add up to target" in {
    val testData = Table(
      ("input", "target", "expected"),
      (Array(2, 7, 11, 15), 9, Array(0,1)),
      (Array(3,2,4), 6, Array(1,2)),
      (Array(3, 3), 6, Array(0,1)),
    )

    forAll(testData) {(input: Array[Int], target: Int, expected: Array[Int]) =>
      val result = twoSum(input, target)
      result should be(expected)
    }
  }
}
