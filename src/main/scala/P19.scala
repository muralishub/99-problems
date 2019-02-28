object P19 {

  def rotate[A](r: Int, list: List[A]): List[A] = {

    def loop(inc: Int, list: List[A], amend: List[A]): List[A] = {

      list match {
        case x :: xs if(inc <= r) => loop(inc + 1, xs, amend :+ x)
        case x :: xs => list ::: amend
        case Nil => amend
      }
    }
    loop(1, list, Nil)
  }
}
