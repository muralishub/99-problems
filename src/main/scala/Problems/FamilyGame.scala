package Problems

class FamilyGame{

}



object FamilyGame {

  def deck: List[Card] = {

    val shape = Stream(Shape.ovals, Shape.squiggles, Shape.diamonds)
    val color = Stream(Color.red, Color.purple, Color.green)
    val number = Stream(Number.one, Number.two, Number.three)
    val shading = Stream(Shading.solid, Shading.striped, Shading.outlined)

    (for {
      s <- shape
      c <- color
      n <- number
      sh <- shading
    } yield (Card(s, c, n, sh))).toList
  }


  def move(setOfTwelve: List[Card]): (Int, List[Card]) = ??? //{
  //
  //    def loop(score: Int, list: List[Card], feature: List[Feature]): (Int, List[Card]) = {
  ////    list match {
  ////      case x :: y :: xs if(x.shape == y.shape) => {
  ////        if(x.shape == xs.head.shape) {
  ////          // second feature
  ////        }
  ////        else {
  ////          loop(0, x :: y :: xs.tail, )
  ////        }
  ////      }
  //
  //      case Nil => ???
  //   //   }
  // //   }
  //   // loop(0, setOfTwelve, List(Shape, Color, Number, Shading) )
  //  }
  //}
}

case class Set(first: Card, second: Card, third: Card)

case class Card(shape: String, color: String, number: String, shading: String)






trait Feature

object Shape extends Feature {
  val ovals = "ovals"
  val squiggles = "squiggles"
  val diamonds = "diamonds"
}

object Color extends Feature {
  val red = "red"
  val purple = "purple"
  val green = "green"
}

object Number extends Feature{

  val one = "one"
  val two = "two"
  val three = "three"
}

object Shading extends Feature {
  val solid = "solid"
  val striped = "striped"
  val outlined = "outlined"
}
