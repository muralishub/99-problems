import scala.annotation.tailrec

object P11 {

  def encodeModified[A](list: List[A]): List[Any] = {

    @tailrec
    def loop(list: List[A], inc: List[Any]): List[Any] = {
      list match {
        case x :: Nil => loop(Nil, inc :+ x)
        case x :: xs if !(x == xs.head) => loop(list.dropWhile(l => l == x), inc :+ x)
        case x :: xs => loop(list.dropWhile(l => l == x), inc :+ ((list.takeWhile(l => l == x)).length, x))
        case Nil => inc
      }
    }
    loop(list, Nil)
  }

}

