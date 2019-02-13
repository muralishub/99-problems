package Exercises
import java.io.File


object NoOfFilesInDirectory {

  def noOfFiles(source: String): Int = {
    val file: File = new File(source)

    def innerFiles(x: File) = {
      x.listFiles.toList
    }

    def loopDirectory(files: List[File], count: Int): Int = {
      files match {
        case x :: Nil if(x.isDirectory) => loopDirectory(innerFiles(x), count)
        case x :: Nil => loopDirectory(Nil, count + 1)
        case x :: xs if(x.isDirectory) => loopDirectory(innerFiles(x) ::: xs, count)
        case x :: xs => loopDirectory(xs, count + 1)
        case Nil => count
      }
    }

    if(file.isDirectory)
    loopDirectory(innerFiles(file), 0)
    else 0
  }
}