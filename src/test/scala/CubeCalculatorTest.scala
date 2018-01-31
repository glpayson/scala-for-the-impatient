import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(1331 == new CubeCalculator().cube(11))
  }
}
