import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RichestCustomerWealthTest extends AnyFlatSpec with Matchers {
  "maximumWealth" should "return the maximum wealth among all customers" in {
    val accounts1 = Array(
      Array(1, 2, 3),
      Array(3, 2, 1)
    )
    maximumWealth(accounts1) should be(6)

    val accounts2 = Array(
      Array(1, 5),
      Array(7, 3),
      Array(3, 5)
    )
    maximumWealth(accounts2) should be(10)

    val accounts3 = Array(
      Array(2, 8, 7),
      Array(7, 1, 3),
      Array(1, 9, 5)
    )
    maximumWealth(accounts3) should be(17)
  }
}
