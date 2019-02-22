package Exercises

import org.scalatest.FunSpec
import org.scalatest.Matchers._
import AllWordsInFileToUppercase._


class AllWordsInFileToUppercaseTest extends FunSpec {

  it("string words start with uppercase") {
    uppercaseStrings("test this string to get uppercase words") shouldBe "Test This String To Get Uppercase Words"
    uppercaseStrings("") shouldBe ""
    uppercaseStrings(" ") shouldBe ""
    uppercaseStrings("test") shouldBe "Test"
  }
}
