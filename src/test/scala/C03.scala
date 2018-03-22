import org.scalatest.FunSuite
import C03.Ex01.randomArray
import C03.Ex02.shiftArray
import C03.Ex03.shiftArray2
import C03.Ex04.partitionOdd
import C03.Ex05.average
import C03.Ex06.reverseSort
import C03.Ex08.dropSomeNegatives
import C03.Ex09.dropSomeMoreNegatives
import C03.Ex10.americanTimeZones
import C03.Ex11.flavor

import scala.collection.mutable.ArrayBuffer

class C03 extends FunSuite {
  //  Write a code snippet that sets a to an array of n random integers between 0
  //  (inclusive) and n (exclusive).
  test("ex_01") {
    assert(randomArray(5).length == 5)
    assert(randomArray(5).forall(_ < 5))
    assert(randomArray(5).forall(_ >= 0))
  }

  //  Write a loop that swaps adjacent elements of an array of integers. For example,
  //  Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
  test("ex_02") {
    assert(shiftArray(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
    assert(shiftArray(Array(1, 2, 3)).deep == Array(2, 1, 3).deep)
    assert(shiftArray(Array()).deep == Array().deep)
  }

  //  Repeat the preceding assignment, but produce a new array with the swapped
  //  values. Use for/yield.
  test("ex_03") {
    assert(shiftArray2(Array(1, 2, 3, 4)).deep == Array(2, 1, 4, 3).deep)
    assert(shiftArray2(Array(1, 2, 3)).deep == Array(2, 1, 3).deep)
    assert(shiftArray2(Array()).deep == Array().deep)
  }

  //  Given an array of integers, produce a new array that contains all positive
  //  values of the original array, in their original order, followed by all values that
  //  are zero or negative, in their original order.
  test("ex_04") {
    assert(partitionOdd(Array(1)).deep == Array(1).deep)
    assert(partitionOdd(Array(1, -2, 3, 4, -5, 0)).deep == Array(1, 3, 4, -2, -5, 0).deep)
    assert(partitionOdd(Array()).deep == Array().deep)
  }

  // How do you compute the average of an Array[Double]?
  test("ex_05") {
    assert(average(Array(1.0, 2.0, 3.0)) == 2.0)
    assert(average(Array()) == 0.0)
  }

  //  How do you rearrange the elements of an Array[Int] so that they appear in
  //  reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
  test("ex_06") {
    assert(reverseSort(Array(3, 1, 0, -4)).deep == Array(-4, 0, 1, 3).deep)
    assert(reverseSort(ArrayBuffer(3, 1, 2, -4)) == ArrayBuffer(-4, 1, 2, 3))
  }

  //  Write a code snippet that produces all values from an array with duplicates
  //  removed. (Hint: Look at Scaladoc.)
  test("ex_07") {
    assert(Array(1, 2, 1).distinct.deep == Array(1, 2).deep)
  }

  /*
  Suppose you are given an array buffer of integers and want to remove all but
  the first negative number. Here is a sequential solution that sets a flag
  when the first negative number is called, then removes all elements beyond.
  var first = true

  var n = a.length
  var i = 0
  while (i < n) {
    if (a(i) >= 0) i += 1
    else {
      if (first) { first = false; i += 1 }
      else { a.remove(i); n -= 1 }
    }
  }

  This is a complex and inefficient solution. Rewrite it in Scala by collecting
  positions of the negative elements, dropping the first element, reversing the
  sequence, and calling a.remove(i) for each index.
   */
  test("ex_08") {
    assert(dropSomeNegatives(ArrayBuffer(1, -2, -3, 4, -5, 6)) == ArrayBuffer(1, -2, 4, 6))
  }

  //  Improve the solution of the preceding exercise by collecting the positions
  //  that should be moved and their target positions. Make those moves and
  //  truncate the buffer. Don’t copy any elements before the first unwanted
  //  element.
  test("ex_09") {
    assert(dropSomeMoreNegatives(ArrayBuffer(1, -2, -3, 4, -5, 6)) == ArrayBuffer(1, -2, 4, 6))
    assert(dropSomeMoreNegatives(ArrayBuffer(1, -2, -3)) == ArrayBuffer(1, -2))
    assert(dropSomeMoreNegatives(ArrayBuffer()) == ArrayBuffer())
  }

  //  Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
  //  that are in America. Strip off the "America/" prefix and sort the result.
  test("ex_10") {
    println(americanTimeZones())
  }

  //  Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
  //  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  //  Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
  //  and get the return value as a Scala buffer. (Why this obscure class? It’s hard
  //  to find uses of java.util.List in the standard Java library.)
  test("ex_11") {
    println(flavor())
  }
}
