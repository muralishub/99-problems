import org.scalatest.FunSpec
import P18._
import org.scalatest.Matchers._

class P18Test extends FunSpec {
  it("extract a slice from a list") {

    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe(List('d, 'e, 'f, 'g))

  }
}
