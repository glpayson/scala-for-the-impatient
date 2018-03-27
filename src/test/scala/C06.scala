import org.scalatest.FunSuite
import C06.Conversions
import C06.GallonsToLitres
import C06.InchesToCentimetres
import C06.MilesToKilometres
import C06.Point
import C06.Suite
import C06.RGB

class C06 extends FunSuite {
  test("ex_01") {
    assert(1.60934 == Conversions.milesToKilometers(1))
    assert(3.78541 == Conversions.gallonsToLitres(1))
    assert(2.54 == Conversions.inchesToCentimetres(1))
  }

  test("ex_02") {
    assert(1.60934 == MilesToKilometres.Convert(1))
    assert(3.78541 == GallonsToLitres.Convert(1))
    assert(2.54 == InchesToCentimetres.Convert(1))
  }

  test("ex_04") {
    assert(1 == Point(1, 2).getX)
  }

  test("ex_06") {
    assert("♣" == Suite.Club.toString)
  }

  test("ex_07") {
    assert(Suite.isRed(Suite.Heart))
  }
}
