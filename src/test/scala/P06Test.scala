import org.scalatest.FunSpec
import org.scalatest.Matchers._

class P06Test extends FunSpec {

  it("is palindrome") {
    P06.isPalindrome(List(1, 2, 3, 4)) shouldBe false
    P06.isPalindrome(List(1, 2, 2, 1)) shouldBe true
    P06.isPalindrome("civic".toList) shouldBe true
    P06.isPalindrome("murali".toList) shouldBe false
    P06.isPalindrome("m".toList) shouldBe true

  }
}
