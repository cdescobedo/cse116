package lecture

import scala.annotation.tailrec

object Algebra {

  /**
   * Computes the prime factorization of a number
   *
   * @param number number that it will compute prime factorization for
   * @return the prime factorization as a List of integers
   */
  def factor(number: Int): List[Int] = {
    @tailrec
    def loop(num: Int, divisor: Int, primes: List[Int]): List[Int] = {
      if (isPrime(num)) {
        num :: primes
      } else if ( num % divisor == 0 && isPrime(divisor)) {
        val newNum = num / divisor
        loop(newNum, 2, divisor :: primes)
      } else {
        val newDiv = divisor + 1
        loop(num, newDiv, primes)
      }
    }
    loop(number, 2, List())
  }

  def isPrime(number: Int): Boolean = !Range(2, number - 1).exists(number % _ == 0)

  def main(args: Array[String]): Unit = {
    println(factor(35).sorted)
    println(isPrime(30))
  }
}
