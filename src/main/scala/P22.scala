import scala.annotation.tailrec

object P22 {
  def range(start: Int, end: Int): List[Int] = {
    @tailrec
    def loop(inc: Int, list: List[Int]): List[Int] = {
      if(inc == end) list
      else
        loop(inc + 1, list :+ inc + 1)
    }
    loop(start, List(start))
  }
}
