import org.scalatest.FunSpec
import P21._
import org.scalatest.Matchers._

class P21Test extends FunSpec {

  it("insert an element at a given position into a list") {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) shouldBe List('a, 'new, 'b, 'c, 'd)
    insertAt('new, 0, List('a, 'b, 'c, 'd)) shouldBe List('new, 'a, 'b, 'c, 'd)
    insertAt('new, 6, List('a, 'b, 'c, 'd)) shouldBe List('a, 'b, 'c, 'd)
  }

}
