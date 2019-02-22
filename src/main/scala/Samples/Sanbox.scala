package Samples

object Sanbox extends App{


  val pf: PartialFunction[Int, Boolean] = {case i if i > 0 =>  i % 2 == 0}

val result = pf.lift
  println(result(0))



}
