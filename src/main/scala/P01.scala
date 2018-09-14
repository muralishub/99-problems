

object P01 {

  def findLast[A](l: List[A]): A = l match {
    case head :: Nil => head
    case head :: tail => findLast(tail)
    case Nil => throw new NoSuchElementException
  }
}
