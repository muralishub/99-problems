import org.scalatest.FunSpec
import org.scalatest.Matchers._
import P12._

class P12Test extends FunSpec {
  it("decode a run length encoded list") {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldBe
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }
}
