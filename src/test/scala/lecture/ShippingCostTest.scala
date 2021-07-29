package lecture

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ShippingCostTest extends AnyFunSuite {
  val weightThirty: Double = 30.0
  val weightThirtyOne: Double = 31.0
  val weightForty: Double = 40.0
  val weightThirtyPointFour: Double = 30.4

  test("Test that shipping cost is calculated correctly according to the weight of the package") {
    assert(FirstObject.computeShippingCost(weightThirty) == 5.0, weightThirty)
    assert(FirstObject.computeShippingCost(weightThirtyOne) == 5.25, weightThirtyOne)
    assert(FirstObject.computeShippingCost(weightForty) == 7.5, weightForty)
    assert(FirstObject.computeShippingCost(weightThirtyPointFour) == 5.1, weightThirtyPointFour)
  }
}
