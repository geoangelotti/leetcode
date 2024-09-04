import scala.annotation.tailrec

@tailrec
def isHappy(n: Int): Boolean = {
  val h = n.toString.map(_.asDigit).map(a => a * a).sum
  if (h == 1 || h == 7) true
  else if (h <= 9) false
  else isHappy(h)
}