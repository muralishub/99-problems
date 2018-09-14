import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P05Test extends FunSpec {

  it("reverse a list") {
    P05.reverse(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
    P05.reverse(List(1)) shouldBe List(1)
    P05.reverse(List()) shouldBe List()
  }

  it("reverse a list simple") {
    P05.reverseSimple(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
    P05.reverseSimple(List(1)) shouldBe List(1)
    P05.reverseSimple(List()) shouldBe List()
  }

  it("reverse using foldLeft") {
    P05.reverseUsingFoldLeft(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
    P05.reverseUsingFoldLeft(List(1)) shouldBe List(1)
    P05.reverseUsingFoldLeft(List()) shouldBe List()
  }


}
