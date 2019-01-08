
object P06 {
  def isPalindrome[A](l: List[A]): Boolean = l.take(l.length / 2) == l.reverse.take(l.length / 2)
}
