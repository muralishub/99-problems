object P20 {

  def removeAt[A](i: Int, list: List[A]): (List[A], A) = {
    def loop(index: Int,list: List[A], newList: List[A]): (List[A], A) = {
      list match {
        case x :: xs if(index == i) => (newList ::: xs, x)
        case x ::  xs => loop(index + 1, xs, List(x))
        case Nil => throw new NoSuchElementException
      }
    }
    loop(0, list, Nil)
  }
}
