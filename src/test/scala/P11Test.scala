import P10.encode
import org.scalatest.FunSpec
import P11._
import org.scalatest.Matchers._

class P11Test extends FunSpec {

  it("modify run length encoding(if length duplicated is 1 return as is)") {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    )
  }
}
