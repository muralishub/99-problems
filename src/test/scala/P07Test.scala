import org.scalatest.FunSpec
import P07._
import org.scalatest.Matchers._

class P07Test extends FunSpec {
  it("flatten a nested list") {
    flatten(List()) shouldBe (List())
    flatten(List(1)) shouldBe (List(1))
    flatten(List(1, 2)) shouldBe (List(1, 2))
    flatten(List(1, List(3))) shouldBe (List(1, 3))
    flatten(List(List(1, 2), List(3, 4))) shouldBe (List(1, 2, 3, 4))
    flatten(List(List('a', 'c'), List('d', 'e'))) shouldBe (List('a',
                                                                 'c',
                                                                 'd',
                                                                 'e'))
  }
}
