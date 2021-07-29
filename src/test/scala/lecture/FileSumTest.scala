package lecture

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FileSumTest extends AnyFunSuite {
  test("Test that the sum of the numbers in the file is correct") {
    val sum: Int = 90
    val fileName = "data/fileSumTestFile.txt"

    assert(LectureQuestion.fileSum(fileName) == sum, fileName)
  }
}
