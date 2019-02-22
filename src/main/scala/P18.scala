import scala.annotation.tailrec

object P18 {

//  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
//       list.drop(start).reverse.drop(end)
//
//  }
//  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
//    list.slice(start, end)
//
//  }

  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
    @tailrec
    def loop(list: List[A], s: Int, e: Int, newList: List[A]): List[A] = {
      list match {
        case x :: xs if (start > s) => loop(xs, s + 1, e, Nil)
        case x :: xs if (end > s) => loop(xs, s + 1, e, newList :+ x)
        case _ => newList
      }
    }
    loop(list, 0, end - start, Nil)
  }
}
