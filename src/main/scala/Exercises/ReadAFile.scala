package Exercises

import java.io.{BufferedWriter, File, FileWriter}

import Exercises.AllWordsInFileToUppercase._

import scala.io.Source
import scala.util.{Failure, Success, Try}

object ReadAFile {


  def readFile(fileName: String): String = {
    val file = new File(fileName)
    val source = Source.fromFile(file)
    def readLines = {
      Try {
        (source.getLines().toList).par.fold(" ")((x, y) =>
          s"""
             |${uppercaseStrings(x)}
             |${uppercaseStrings(y)}
               """.stripMargin.trim)
      }
    }

    readLines match {
      case Success(value) => {
        source.close

        val readFile = new File("./src/test/directory/ourput.txt")
        val bw = new BufferedWriter(new FileWriter(readFile))
        bw.write(value)
        bw.close
        value
      }
      case Failure(exception) => s"cant read file: $exception"
    }
  }
}


















