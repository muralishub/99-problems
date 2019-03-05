import org.scalatest.FunSpec
import P20._
import org.scalatest.Matchers._

class P20Test extends FunSpec {

  it("Remove the Kth element from a list") {
    removeAt(1, List('a, 'b, 'c, 'd)) shouldBe (List('a, 'c, 'd),'b)
  }

}
