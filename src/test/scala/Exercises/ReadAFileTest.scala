package Exercises

import org.scalatest.FunSpec
import ReadAFile._
import org.scalatest.Matchers._


class ReadAFileTest extends FunSpec {

  it("read first line") {

    readFile("./src/test/directory/testfile.txt") shouldBe
      """
        |Aa
        |Aa
        |Aa
      """.stripMargin.trim
  }

}
