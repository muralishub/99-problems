import scala.annotation.tailrec

object P09 {
  def pack[A](list: List[A]): List[List[A]] = {

    @tailrec
    def loop(list: List[A], inc: List[A], result: List[List[A]]): List[List[A]] = {

      list match {
        case Nil => result
        case x :: Nil if (inc == Nil) => loop(Nil, inc, result :+ List(x))
        case x :: Nil if (inc.head == x) => loop(Nil, Nil, result :+ (inc :+ x))
        case x :: Nil => loop(Nil, Nil, result :+ inc :+ List(x))
        case x :: xs if (inc == Nil) => loop(xs, List(x), result)
        case x :: xs if (inc.head == x) => loop(xs, inc :+ x, result)
        case x :: xs => loop(xs, List(x), result :+ inc)
      }
    }

    loop(list, List[A](), List[List[A]]())
  }

  // implementation using drop and take while
  def pack2[A](list: List[A]): List[List[A]] = {
    @tailrec
    def loop(list: List[A], result: List[List[A]]): List[List[A]] = {
      list match {
        case x :: xs => loop(list.dropWhile(l => l == x), result :+ list.takeWhile(l => l == x))
        case Nil => result
      }
    }

    loop(list, Nil)
  }
}

