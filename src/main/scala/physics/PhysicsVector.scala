package physics

class PhysicsVector(var x: Double, var y: Double, var z: Double) {

  def multiplyByConstant(constant: Double): Unit = {
    this.x *= constant
    this.y *= constant
    this.z *= constant
  }

  def addVector(vector: PhysicsVector): Unit = {
    this.x += vector.x
    this.y += vector.y
    this.z += vector.z
  }
}
