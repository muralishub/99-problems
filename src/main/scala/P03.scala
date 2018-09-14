import scala.annotation.tailrec

object P03 {

  def findKthElement[A](i: Int, l: List[A]):A  = {

    @tailrec
    def loop(list: List[A], inc: Int): A = list match {
      case h :: tail if(i == inc) => h
      case h :: tail => loop(tail, inc + 1)
      case Nil => throw new IndexOutOfBoundsException
    }
    loop(l, 0)
  }

  @tailrec
  def findKthElement2[A](i:Int, l: List[A]): A = (i, l) match {
    case (0, h :: t) => l.head
    case (n, h :: t) => findKthElement2(n -1 , t)
    case (_, _) => throw new IndexOutOfBoundsException
  }
}
