object P12 {
  def decode(list: List[(Int, Symbol)]): List[Symbol] = {
    def loop(list: List[(Int, Symbol)], inc: List[Symbol]): List[Symbol] = {
      list match {
        case  x :: xs => loop(xs, inc ::: List.fill(x._1)(x._2))
        case   Nil => inc
      }
    }
    loop(list, Nil)
  }
}
