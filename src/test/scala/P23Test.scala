import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P23Test extends FunSpec {

  it("Extract a given number of randomly selected elements from a list") {
    P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).length shouldBe(3)
  }

}
