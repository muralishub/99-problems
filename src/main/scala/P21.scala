import scala.annotation.tailrec

object P21 {

  def insertAt[A](value: A, position: Int, list: List[A]): List[A] = {
    @tailrec
    def loop(i: Int, pre: List[A], nextList: List[A]): List[A] = {
      nextList match {
        case x ::  xs if position == i => (pre :+ value) ::: nextList
        case x ::  xs  => loop(i + 1, pre :+ x, xs)
        case Nil => list
      }
    }
    loop(0, Nil, list)
  }
}
