package Samples

import scala.util.{Success, Try}

object CaseClassValidation extends App{

  val person: Either[Throwable, String] = Person(100).ageIsValid


//  println(person)


}

case class Person(age: Int) {

  val ageIsValid: Either[ValidationException, String] = Try {
    require(age < 70, "age cannot be greater than 70")
  } match {
    case Success(_) => Right("age is valid")
    case _ => Left(ValidationException("not valid"))
  }


  if(age > 100) Right(age) else ValidationException(s"age $age is not valid")


}


case class ValidationException(message: String) extends Throwable

