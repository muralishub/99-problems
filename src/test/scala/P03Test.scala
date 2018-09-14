import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P03Test extends FunSpec {

  it("find nth element") {
   P03.findKthElement(0, List(1, 2)) shouldBe(1)
   P03.findKthElement(2, List(1, 2, 3)) shouldBe(3)
   (try(P03.findKthElement(2, Nil)) catch {case _ : IndexOutOfBoundsException => "exception"}) shouldBe("exception")
   (try(P03.findKthElement(2, List(1))) catch {case _ : IndexOutOfBoundsException => "exception"}) shouldBe("exception")
  }

  it("find nth element 2nd method") {
    P03.findKthElement2(0, List(1, 2)) shouldBe(1)
    P03.findKthElement2(2, List(1, 2, 3)) shouldBe(3)
    (try(P03.findKthElement2(2, Nil)) catch {case _ : IndexOutOfBoundsException => "exception"}) shouldBe("exception")
    (try(P03.findKthElement2(2, List(1))) catch {case _ : IndexOutOfBoundsException => "exception"}) shouldBe("exception")
  }
}
