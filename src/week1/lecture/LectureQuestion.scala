package week1.lecture

import scala.io.{BufferedSource, Source}

object LectureQuestion {

  def fileSum(fileName: String): Int = {
    val file: BufferedSource = Source.fromFile(fileName)
    var count: Int = 0
    var tempString: String = ""
    file.getLines().foreach(line => {
      val formattedLine = line + '\n'
      formattedLine.foreach(char =>
        if (char != '#' && char != '\n') {
          tempString += char
        } else {
          count += tempString.toInt
          tempString = ""
        }
      )
    })
    count
  }

  def main(args: Array[String]): Unit = {
    val fileName = "data/numbersTestFile.txt"
    val count = fileSum(fileName)
    println(count)
  }
}
