object P08 {
  def compress[A](list: List[A]): List[A] = list match {
    case Nil                                => list
    case l :: Nil if l == list.reverse.head => list
    case l :: ls if (l == ls.head)          => compress(ls)
    case l :: ls                            => l :: compress(ls)
  }
}
