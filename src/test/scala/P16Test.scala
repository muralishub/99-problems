import org.scalatest.FunSpec
import P16._
import org.scalatest.Matchers._

class P16Test extends FunSpec {

  it("drop every nth element in a list") {
    drop(2, List(1, 2, 3, 4, 5, 6, 7)) shouldBe List(1, 3, 5, 7)
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }
}
