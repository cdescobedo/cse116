package lecture

import scala.io.{BufferedSource, Source}

object LectureQuestion {

  /**
   * - Takes a file name and computes the sum of all numbers
   *   in that file where the numbers are delimited by a #
   *   and can span multiple lines
   *
   * @param fileName the name of the input file
   * @return the sum of all numbers in fileName
   */
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
