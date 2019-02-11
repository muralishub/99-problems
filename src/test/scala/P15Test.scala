import org.scalatest.FunSpec
import org.scalatest.Matchers._
import P15._

class P15Test extends FunSpec {
  it("duplicate the elements of a list a given number of times") {
    duplicateN(3, List('a)) shouldBe List('a, 'a, 'a)
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }
}
