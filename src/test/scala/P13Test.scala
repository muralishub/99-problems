import org.scalatest.FunSpec
import P13._
import org.scalatest.Matchers._


class P13Test extends FunSpec {

  it("run length encode direct solution(Implimentation same as P10)") {
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
