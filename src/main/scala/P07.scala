object P07 {

  def flatten(list: List[Any]): List[Any] = {
    list match {
      case Nil                => Nil
      case (l: List[_]) :: ls => l ::: flatten(ls)
      case l :: ls            => l :: flatten(ls)
    }
  }
}
