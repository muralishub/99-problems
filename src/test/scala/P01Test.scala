import org.scalatest.FunSpec
import org.scalatest.Matchers._


class P01Test extends FunSpec {
it("find last element in a list") {
  P01.findLast(List(1, 2, 3)) shouldBe(3)
  P01.findLast(List(1, 2)) shouldBe(2)
  P01.findLast(List(1)) shouldBe(1)
  (try{ P01.findLast(List())} catch {case _: NoSuchElementException => "Exception"}) shouldBe("Exception")
}

}
