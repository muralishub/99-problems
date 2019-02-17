package Problems

class FamilyGame{

}



object FamilyGame {

  def deck: Stream[(Shape.type , Color.type , Number.type , Shading.type)] = {

    val shape = Stream(Shape.ovals, Shape.squiggles, Shape.diamonds)
    val color = Stream(Color.red, Color.purple, Color.green)
    val number = Stream(Number.one, Number.two, Number.three)
    val shading = Stream(Shading.solid, Shading.striped, Shading.outlined)

      for {
      s <- shape
      c <- color
      n <- number
      sh <- shading
    } yield (s, c, n, sh)
}

  def move(currentCards: Seq[(Shape.type , Color.type , Number.type , Shading.type)]): Int = currentCards match {
    case Nil => 0
    case first :: second :: third :: list if(first._1 == second._1) =>
  }


  def validSet(setofThree: Seq[(Shape.type, Color.type, Number.type, Shading.type)]): Boolean = {
    setofThree match {
      case first :: second :: three :: Nil if first._1 == second._1 && first._1 == three._1 => ???
    }
  }




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
