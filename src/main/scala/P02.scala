import java.util.NoSuchElementException

object P02 {

  def findLastButOne[A](l: List[A]): A = l match {
    case head :: tailHead :: Nil => head
    case head :: tail => findLastButOne(tail)
    case _ => throw new NoSuchElementException
  }

}
