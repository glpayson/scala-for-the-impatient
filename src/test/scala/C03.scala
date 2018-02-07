import org.scalatest.FunSuite
import C03.Ex01.randomArray
import C03.Ex02.shiftArray
import C03.Ex03.shiftArray2
import C03.Ex04.partitionOdd
import C03.Ex05.average
import C03.Ex06.reverseSort
import C03.Ex08.dropFirstNegative
import C03.Ex09.dropFirstNegative2
import C03.Ex10.americanTimeZones
import C03.Ex11.flavor

import scala.collection.mutable.ArrayBuffer

class C03 extends FunSuite {
  test("ex_01") {
    assert(randomArray(5).length == 5)
    assert(randomArray(5).forall(_ < 5))
    assert(randomArray(5).forall(_ >= 0))
  }

  test("ex_02") {
    assert(shiftArray(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
    assert(shiftArray(Array(1, 2, 3)).deep == Array(2, 1, 3).deep)
    assert(shiftArray(Array()).deep == Array().deep)
  }

  test("ex_03") {
    assert(shiftArray2(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
    assert(shiftArray2(Array(1, 2, 3)).deep == Array(2, 1, 3).deep)
    assert(shiftArray2(Array()).deep == Array().deep)
  }

  test("ex_04") {
    assert(partitionOdd(Array(1)).deep == Array(1).deep)
    assert(partitionOdd(Array(1, 2, 3, 4)).deep == Array(2, 4, 1, 3).deep)
    assert(partitionOdd(Array()).deep == Array().deep)
  }

  test("ex_05") {
    assert(average(Array(1.0, 2.0, 3.0)) == 2.0)
    assert(average(Array()) == 0.0)
  }

  test("ex_06") {
    assert(reverseSort(Array(3, 1, 0, -4)).deep == Array(-4, 0, 1, 3).deep)
    assert(reverseSort(ArrayBuffer(3, 1, 2, -4)) == ArrayBuffer(-4, 1, 2, 3))
  }

  test("ex_07") {
    assert(Array(1, 2, 1).distinct.deep == Array(1, 2).deep)
  }

  test("ex_08") {
    assert(dropFirstNegative(ArrayBuffer(1, -2, -3, 4, -5, 6)) == ArrayBuffer(1, -2, 4, 6))
  }

  test("ex_09") {
    assert(dropFirstNegative2(ArrayBuffer(1, -2, -3, 4, -5, 6)) == ArrayBuffer(1, -2, 4, 6))
  }

  test("ex_10") {
    println(americanTimeZones())
  }

  test("ex_11") {
    println(flavor())
  }
}
