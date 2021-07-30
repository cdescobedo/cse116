package physics

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestVector extends AnyFunSuite {
  val constOne = 0
  val constTwo = 5
  val vectorOne = new PhysicsVector(3.0, -5.0, 2.0)
  val vectorTwo = new PhysicsVector(20.0, 7.0, -2.0)
  val vectorThree = new PhysicsVector(3.0, -5.0, 2.0)

  test("Verify the multiply by constant functionality") {
    vectorOne.multiplyByConstant(5.0)
    assert(
      vectorOne.x == 15.0 &&
        vectorOne.y == -25.0 &&
        vectorOne.z == 10.0,
      constTwo
    )

    vectorOne.multiplyByConstant(0)
    assert(
      vectorOne.x == 0 &&
      vectorOne.y == 0 &&
      vectorOne.z == 0,
      constOne
    )
  }

  test("Verify the vector addition functionality") {
    vectorThree.addVector(vectorTwo)
    assert(
      vectorThree.x == 23.0 &&
      vectorThree.y == 2.0 &&
      vectorThree.z == 0
    )
  }
}
