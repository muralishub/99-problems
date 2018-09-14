import java.util.NoSuchElementException

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P02Test extends FunSpec {

  it("find last but 1") {
    (try{ P02.findLastButOne(List(1))} catch{case _: NoSuchElementException => "exception"}) shouldBe("exception")
    (try{ P02.findLastButOne(Nil)} catch{case _: NoSuchElementException => "exception"}) shouldBe("exception")
    P02.findLastButOne(List(1, 2)) shouldBe(1)
    P02.findLastButOne(List(1, 2, 3)) shouldBe(2)
    P02.findLastButOne(List(1, 2, 3, 4, 5, 6)) shouldBe(5)
  }

}
