import scala.annotation.tailrec

object P10 {
  def encode[A](list: List[A]): List[(Int, A)] = {
    @tailrec
    def loop(list: List[A], result: List[(Int, A)]): List[(Int, A)] = {
      list match {
        case x :: xs => loop(list.dropWhile(l => l == x), result :+ (list.takeWhile(l => l == x).length, x))
        case Nil => result
      }
    }
    loop(list, Nil)
  }
}
