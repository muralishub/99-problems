object P14 {

  def duplicate[A](list: List[A]): List[A] = {
    def loop(list: List[A], result: List[A]): List[A] = {
        list match {
          case x :: xs => loop(xs, result :+ x :+x )
          case Nil => result
        }
    }
    loop(list, Nil)
  }
}
