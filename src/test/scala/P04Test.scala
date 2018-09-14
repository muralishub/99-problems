import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P04Test extends FunSpec {

  it("find no of elements") {
    P04.findNoOfElements(List(1, 2, 3)) shouldBe(3)
    P04.findNoOfElements(List(1)) shouldBe(1)
    P04.findNoOfElements(List[String]()) shouldBe(0)
  }

  it("find no of elements simple") {
    P04.findNoOfElements2(List(1, 2, 3)) shouldBe(3)
    P04.findNoOfElements2(List(1)) shouldBe(1)
    P04.findNoOfElements2(List[String]()) shouldBe(0)
  }

}
