object P18 {

//  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
//       list.drop(start).reverse.drop(end)
//
//  }
  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
    list.slice(start, end)

  }
}
