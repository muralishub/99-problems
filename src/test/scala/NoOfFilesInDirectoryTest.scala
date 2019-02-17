import java.io.File

import org.scalatest.FunSpec
import Exercises.NoOfFilesInDirectory._
import org.scalatest.Matchers._

class NoOfFilesInDirectoryTest extends FunSpec {

  it("count no of files in a directory") {
    noOfFiles("./src/test/directory/") shouldBe 7
    noOfFiles("./src/test/notValidDirectory") shouldBe 0
    noOfFiles("./xxx") shouldBe 0

  }

}