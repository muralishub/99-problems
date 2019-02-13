object P17 {

  def split[A](i: Int, list: List[A]): (List[A], List[A]) = (list.take(i), list.drop(i))

}
