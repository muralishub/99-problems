package Exercises

object AllWordsInFileToUppercase {

  def uppercaseStrings(s: String): String = {

    def uppercaseWords(value: String): String = value.toList match {
      case Nil => ""
      case x :: xs => x.toUpper + value.tail
    }

    def loop(s: List[String], newWord: String): String = {
      s match {
        case Nil => newWord
        case x :: xs if newWord.isEmpty => loop(xs, newWord + uppercaseWords(x))
        case x :: xs  => loop(xs, newWord + " " +  uppercaseWords(x))
      }
    }

    loop(s.split(" ").toList, "")
  }
}
