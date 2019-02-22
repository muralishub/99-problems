package Exercises.canvas


class Canvas(width: Int, height: Int) {

  def name = width + height


  def createCanvas = ???
  def createLine = ???
  def createRectangle = ???
  def createFilll = ???


}

object Canvas {

  val HORIZONTAL_BORDER_LINE = '|'
  val VERTICAL_BORDER_LINE = '-'
  val LINE_BREAKER = '\n'
  val EMPTY = ' '

  def apply(width: Int, height: Int): Canvas = new Canvas(width, height)
}


