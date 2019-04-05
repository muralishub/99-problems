import org.scalatest.FunSpec
import org.scalatest.Matchers._
import P24._

class P24Test extends FunSpec {
  it("Lotto: Draw N different random numbers from the set 1..M") {
    lotto(3, 10).length shouldBe 3
    lotto(3, 10).map(x => x <= 10) shouldBe List(true, true, true)
  }
}
