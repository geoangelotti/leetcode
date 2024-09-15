import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class HappyNumberTest extends AnyFlatSpec with TableDrivenPropertyChecks with Matchers {
  "isHappy" should "return if a number is Happy" in {
    val testData = Table(
      ("num", "expected"),
      (19, true),
      (2, false)
    )

    forAll(testData) { (num: Int, expected: Boolean) =>
      val result = isHappy(num)
      result should be(expected)
    }
  }
}
