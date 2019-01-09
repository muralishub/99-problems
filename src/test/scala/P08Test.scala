import org.scalatest.FunSpec
import P08._
import org.scalatest.Matchers._

class P08Test extends FunSpec {
  it("eliminate consecutive duplicates of list elements") {
    compress(List()) shouldBe (List())
    compress(List(1)) shouldBe (List(1))
    compress(List('a, 'a, 'c)) shouldBe (List('a, 'c))
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe (
        List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
