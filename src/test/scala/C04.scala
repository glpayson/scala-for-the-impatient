import org.scalactic.{Equality, TolerantNumerics}
import org.scalatest.FunSuite
import C04.Ex02._
import C04.Ex06.daysOfTheWeek
import C04.Ex08.minmax
import C04.Ex09.lteqgt

class C04 extends FunSuite {
  val epsilon = 1e-3f
  implicit val doubleEq: Equality[Double] = TolerantNumerics.tolerantDoubleEquality(epsilon)

  // Set up a map of prices for a number of gizmos that you covet. Then produce a second map with the same keys and the
  // prices at a 10 percent discount.
  test("ex_01") {
    val stuff = Map("gizmo1" -> 42.00, "gizmo2" -> 9000.01)
    val discountedStuff = stuff.map({ case (k, v) => (k, v * 0.9) })
    assert(discountedStuff("gizmo1") === 37.80)
    assert(discountedStuff("gizmo2") === 8100.01)
  }

  /*
  Write a program that reads words from a file. Use a mutable map to count how often each word appears. To read the
  words, simply use a java.util.Scanner:
    val in = new java.util.Scanner(new java.io.File("myfile.txt"))
    while (in.hasNext()) process in.next()

  Or look at Chapter 9 for a Scalaesque way.
  At the end, print out all words and their counts.
   */
  test("ex_02") {
    assert(wordCount()("capybara") == 4)
  }

  // Repeat the preceding exercise with an immutable map.
  test("ex_03") {
    assert(wordCountImmutable()("capybara") == 4)
  }

  // Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
  test("ex_04") {
    assert(wordCountSorted().firstKey == "(hydrochoerus")
  }

  // Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
  test("ex_05") {
    assert(wordCountTreeMap()("capybara") == 4)
  }

  test("ex_06") {
    assert(daysOfTheWeek().keysIterator.next() == "Monday")
  }

  test("ex_07") {
  }

  test("ex_08") {
    assert(minmax(Array(1, 5, 9, 3)) == (1, 9))
  }

  test("ex_09") {
    assert(lteqgt(Array(1, 2, 3, 3, 3, 4, 5, 6), 3) == (2, 3, 3))
  }

  test("ex_10") {
    // For top secret spy messages
    print("Meet me at Gorky park".zip("Bring the microfiche."))
  }

}
