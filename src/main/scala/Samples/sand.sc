
//partially applied function

val positiveNo: PartialFunction[Int, Int] = {case i if(i > 0) => i}
println(positiveNo.lift(0))

