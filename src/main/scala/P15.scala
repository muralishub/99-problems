import scala.annotation.tailrec

object P15 {

  def duplicateN[A](n: Int, list: List[A]): List[A] = {

    @tailrec
    def loop(list: List[A], result: List[A]): List[A] = {
      list match {
        case x :: xs => loop(xs, result ::: List.fill(n)(x))
        case Nil => result
      }
    }
    loop(list, Nil)
  }
}
