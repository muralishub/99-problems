object P08 {
  def compress[A](list: List[A]): List[A] = list match {
    case Nil                                => list
    case l :: Nil if l == list.reverse.head => list
    case l :: ls if (l == ls.head)          => l :: compress(ls.tail)
    case l :: ls                            => l :: compress(ls)
  }
}
