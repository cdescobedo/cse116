package lecture

object FirstObject {

  /**
   * - The shipping cost is $5 + 0.25 per pound over 30
   * - Every package weighing 30lbs or less will cost $5
   *
   * Ex: A 31 lb package will cost $5.25
   *
   * @param weight the weight of the shipping package
   * @return the shipping cost represented as a double
   */
  def computeShippingCost(weight: Double): Double = {
    if (weight <= 30) 5.0
    else 5.0 + (weight - 30.0) * 0.25
  }

  def main(args: Array[String]): Unit = {
    println(s"weight: 30, cost: ${computeShippingCost(30)} dollars")
    println(s"weight: 31, cost: ${computeShippingCost(31)} dollars")
    println(s"weight: 40, cost: ${computeShippingCost(40)} dollars")
    println(s"weight: 30.4, cost: ${computeShippingCost(30.4)} dollars")
  }
}
