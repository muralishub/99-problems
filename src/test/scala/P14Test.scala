import org.scalatest.FunSpec
import org.scalatest.Matchers._
import P14._

class P14Test extends FunSpec {
  it("duplicate elements in a list") {
    duplicate(List('a, 'b, 'c, 'c, 'd)) shouldBe List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }
}
