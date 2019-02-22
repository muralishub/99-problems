import org.scalatest.FunSpec
import P19._
import org.scalatest.Matchers._

class P19Test extends FunSpec {

  it("rotate a list N times to the left") {
    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

}
