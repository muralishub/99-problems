import scala.annotation.tailrec

object P05 {

def reverse[A](list: List[A]): List[A] = {
  @tailrec
  def loop(l: List[A], newList: List[A]): List[A] = l match {
      case h :: t => loop(t, h +: newList)
      case _ => newList
    }
    loop(list, List.empty)
  }

  //simple not good for big lists
  def reverseSimple[A](list: List[A]): List[A] = list match {
    case Nil => list
    case h :: t => reverseSimple(t) :+ h
  }

  //reverse using foldLeft
  def reverseUsingFoldLeft[A](list: List[A]): List[A] = list.foldLeft(List[A]())((x, y) => y :: x)

}
