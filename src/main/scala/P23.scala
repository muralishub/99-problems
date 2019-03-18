
object P23 {
  def randomSelect[A](i: Int, list: List[A]): List[A] = {
    if (i < 1) Nil
    else {
      val (ls, v) = P20.removeAt((new util.Random).nextInt(list.length), list)
      v :: randomSelect(i - 1, ls)
    }
  }
}
