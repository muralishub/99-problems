import org.scalatest.FunSpec
import org.scalatest.Matchers._
import P10._

class P10Test extends FunSpec {
  it("run length encoding of list") {
    encode(List('a, 'a, 'a)) shouldBe(List((3, 'a)))
    encode(List('a, 'a, 'a, 'b)) shouldBe(List((3, 'a), (1, 'b)))
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
