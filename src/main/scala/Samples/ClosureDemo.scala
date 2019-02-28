package Samples



object ClosureDemo extends App {

  val s = Article("test")
  val s2 = Article("test")

println(s == s2)

}

case class Article(name: String)