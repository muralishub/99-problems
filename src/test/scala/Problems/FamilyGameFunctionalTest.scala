package Problems

import org.scalatest.FunSpec

class FamilyGameFunctionalTest extends FunSpec{



  it("run single player move") {
    val firstCard: Card = Card(Shape.ovals, Color.red, Number.two, Shading.solid)
    val secondCard: Card = Card(Shape.ovals, Color.red, Number.two, Shading.striped)
    val thirdCard: Card = Card(Shape.ovals, Color.red, Number.two, Shading.outlined)

    val set = Set(firstCard, secondCard, thirdCard)

   // move(set)

  }

}
