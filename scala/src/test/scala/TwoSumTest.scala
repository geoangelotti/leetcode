import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TwoSumTest extends AnyFlatSpec with Matchers {
  "twoSum" should "return the indices of the two numbers that they add up to target" in {
    val input1 = Array(2, 7, 11, 15)
    val expected1 = Array(0,1)
    twoSum(input1, 9) should be(expected1)

    val input2 = Array(3,2,4)
    val expected2 = Array(1,2)
    twoSum(input2, 6) should be(expected2)

    val input3 = Array(3,3)
    val expected3 = Array(0, 1)
    twoSum(input3, 6) should be(expected3)
  }
}
