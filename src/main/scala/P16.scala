object P16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    def loop(list: List[A], i: Int, newList: List[A]): List[A] = {
      list match {
        case x :: xs if n == i => loop(xs, 1, newList)
        case x :: xs => loop(xs, i + 1, newList :+ x)
        case Nil => newList
      }
    }
    loop(list, 1, Nil)
  }
}
