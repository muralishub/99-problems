import org.scalatest.FunSpec
import P08._
import org.scalatest.Matchers._

class P08Test extends FunSpec {
  it("eliminate consecutive duplicates of list elements") {
    compress(List(1, 1, 2, 3)) shouldBe List(1, 2, 3)
    compress(List(1, 1, 2, 1, 3, 3)) shouldBe List(1, 2, 1, 3)
  }
}
