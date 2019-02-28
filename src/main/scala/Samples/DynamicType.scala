package Samples
import scala.collection.mutable


class MyMap[T](defaultValue: T) extends Dynamic {

  val values: mutable.Map[String, T] = mutable.Map.empty[String, T]

  def selectDynamic(name: String): T = {
    values.get(name) match {
      case Some(value) => value
      case None => defaultValue
    }
  }

  def updateDynamic(name: String)(value: T): Unit = {
    values(name) = value
  }

}


object Application extends App {



}