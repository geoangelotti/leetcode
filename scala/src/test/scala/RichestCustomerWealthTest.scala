import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

class RichestCustomerWealthTest extends AnyFlatSpec with TableDrivenPropertyChecks with Matchers {
  "maximumWealth" should "return the maximum wealth among all customers" in {
    val testData = Table(
      ("accounts", "expected"),
      (Array(
        Array(1, 2, 3),
        Array(3, 2, 1)
      ), 6),
      (Array(
        Array(1, 5),
        Array(7, 3),
        Array(3, 5)
      ), 10)
      ,
      (Array(
        Array(2, 8, 7),
        Array(7, 1, 3),
        Array(1, 9, 5)
      ), 17)
    )

    forAll(testData) { (input: Array[Array[Int]], expected: Int) =>
      val result = maximumWealth(input)
      result should be(expected)
    }
  }
}
