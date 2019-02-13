import org.scalatest.FunSpec
import P17._
import org.scalatest.Matchers._

class P17Test extends FunSpec {
  it("split a list into two parts cutting at given no") {
    split(2, List(1, 2, 3, 4, 5)) shouldBe (List(1, 2), List(3, 4, 5))
    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }
}
