import scala.annotation.tailrec

object P04 {

  def findNoOfElements[A](l: List[A]): Int = {

    @tailrec
    def loop(list: List[A], inc: Int): Int = list match {
      case Nil => inc
      case head :: tail => loop(tail, inc + 1)
    }
    loop(l, 0)
  }

  //not efficient but simple doesnt work for long lists
  def findNoOfElements2[A](l: List[A]): Int = l match {
    case Nil => 0
    case h :: t => 1 + findNoOfElements(t)
  }

}
