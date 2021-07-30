package lecture

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AlgebraTest extends AnyFunSuite {
  test("Verify that the prime factorization of a given number is correct") {
    assert(Algebra.factor(17).sorted == List(17), 17)
    assert(Algebra.factor(30).sorted == List(2, 3, 5), 30)
    assert(Algebra.factor(35).sorted == List(5, 7), 35)
    assert(Algebra.factor(1000).sorted == List(2 ,2 ,2 ,5 ,5 ,5), 1000)
  }
}
