package Problems

import org.scalatest.FunSpec
import FamilyGame._
import Shape._, Color._, Number._, Shading._
import org.scalatest.Matchers._


class FamilyGameFunctionalTest extends FunSpec{


  it("full deck") {
   println(deck)
  }



  it("run single player move") {
    val firstCard: Card = Card(Shape.ovals, Color.red, Number.two, Shading.solid)
    val secondCard: Card = Card(Shape.ovals, Color.red, Number.two, Shading.striped)
    val thirdCard: Card = Card(Shape.ovals, Color.red, Number.two, Shading.outlined)

    val twelveCards = List(
      Card(ovals,red,one,solid),
      Card(ovals,red,one,striped),
      Card(ovals,red,one,outlined),
      Card(ovals,red,two,solid),
      Card(ovals,red,two,striped),
      Card(ovals,red,two,outlined),
      Card(ovals,red,three,solid),
      Card(ovals,red,three,striped),
      Card(ovals,red,three,outlined),
      Card(ovals,purple,one,solid),
      Card(ovals,purple,one,striped),
      Card(ovals,purple,one,outlined)
    )
    move(twelveCards)._1 shouldBe 1
    move(twelveCards)._2.length shouldBe 11
  }
}
