import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class AddDigitsTest extends AnyFlatSpec with TableDrivenPropertyChecks with Matchers  {
  "addDigits" should "return the sum of the digits" in {
    val testData = Table(
      ("digits", "expected"),
      (38,2),
      (0,0)
    )

    forAll(testData) { (digits: Int, expected: Int) =>
      val result = addDigits(digits)
      result should be(expected)
    }
  }
}
