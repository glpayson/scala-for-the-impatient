import java.time.DayOfWeek

import C02.Ex01.signum
import C02.Ex04.countToTen
import C02.Ex05.countToTenProc
import C02.Ex06.unicodeProd
import C02.Ex07.mapUnicodeProd
import C02.Ex09.recursiveUnicodeProd
import C02.Ex10.power
import C02.Ex11.DateInterpolator
import org.scalatest.FunSuite
import org.scalatest.Matchers._

class C02 extends FunSuite {
  test("ex_01") {
    assert(signum(1) == 1)
    assert(signum(0) == 4)
    assert(signum(-1) == -1)
    assert(signum(Integer.MAX_VALUE) == 1)
    assert(signum(Integer.MIN_VALUE) == -1)
  }

  // ex_02
  // scala> val x = {}
  // x: Unit = ()
  // type is Unit, value is ()

  test("ex_03") {
    var y = 2
    val x: Unit = y = 1
    println(x) // type is Unit, value is ()
  }

  test("ex_04") {
    countToTen() // -10 points
  }

  test("ex_05") {
    countToTenProc(100)
  }

  test("ex_06") {
    assert(unicodeProd("Hello") == 9415087488L)
  }

  test("ex_07") {
    assert(mapUnicodeProd("Hello") == 9415087488L)
  }

  // ex_08 == ex_07

  test("ex_09") {
    assert(recursiveUnicodeProd("Hello") == 9415087488L)
  }

  test("ex_10") {
    assert(power(3, 4) == 81)
    assert(power(3, 3) == 27)
    assert(power(3, 0) == 1)
    assert(power(3, -2) == 0.1111111111111111)
  }

  test("ex_11") {
    val year = 1999
    val month = 11
    val day = 11
    assert(date"$year-$month-$day".getDayOfWeek == DayOfWeek.THURSDAY)

    an[IllegalArgumentException] should be thrownBy {
      date"-$year-$month-$day"
    }

    an[IllegalArgumentException] should be thrownBy {
      date"$year-$month-"
    }
  }
}
