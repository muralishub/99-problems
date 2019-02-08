import P09._
import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P09Test extends FunSpec {
  it("pack consecutive duplicates of list elements into sublists") {

    pack(List()) shouldBe List()
    pack(List(1)) shouldBe List(List(1))
    pack(List(1, 1, 1)) shouldBe List(List(1, 1, 1))
    pack(List(1, 1, 2, 2)) shouldBe List(List(1, 1), List(2, 2))

    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List(
      List('a, 'a, 'a, 'a),
      List('b),
      List('c, 'c),
      List('a, 'a),
      List('d),
      List('e, 'e, 'e, 'e))

    pack2(List()) shouldBe List()
    pack2(List(1)) shouldBe List(List(1))
    pack2(List(1, 1, 1)) shouldBe List(List(1, 1, 1))
    pack2(List(1, 1, 2, 2)) shouldBe List(List(1, 1), List(2, 2))

    pack2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List(
      List('a, 'a, 'a, 'a),
      List('b),
      List('c, 'c),
      List('a, 'a),
      List('d),
      List('e, 'e, 'e, 'e))
  }
}

