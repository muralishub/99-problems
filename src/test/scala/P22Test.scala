import org.scalatest.FunSpec
import org.scalatest.Matchers._
import P22._

class P22Test extends FunSpec {

  it("Create a list containing all integers within a given range") {
    range(4, 9) shouldBe List(4, 5, 6, 7, 8, 9)
  }
}
