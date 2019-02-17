package Problems

import FamilyGame.{deck, move}
import org.scalatest.FunSpec

class FamilyGameTest extends FunSpec {

  it("deck total") {


    deck.foreach(println)
  }

  it("make a move") {

    move(currrentCards) shouldBe 11

  }

  private def currrentCards: Stream[(String, String, String, String)] = {
    Stream(
      ("ovals", "red", "one", "solid")
        ("ovals", "red", "one", "striped")
        ("ovals", "red", "one", "outlined")
        ("ovals", "red", "two", "solid")
        ("ovals", "red", "two", "striped")
        ("ovals", "red", "two", "outlined")
        ("ovals", "red", "three", "solid")
        ("ovals", "red", "three", "striped")
        ("ovals", "red", "three", "outlined")
        ("ovals", "purple", "one", "solid")
        ("ovals", "purple", "one", "striped")
        ("ovals", "purple", "one", "outlined")

    )
  }


}
