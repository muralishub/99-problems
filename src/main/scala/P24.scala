import scala.util.Random

object P24 {
  //Lotto: Draw N different random numbers from the set 1..M
def lotto(n: Int, to: Int): List[Int] = {
  def loop(i: Int, list: List[Int]): List[Int] = {
    if (i < n)
      loop(i + 1, list :+ Random.nextInt(to))
    else list
  }
  loop(0, List.empty)
}
}
