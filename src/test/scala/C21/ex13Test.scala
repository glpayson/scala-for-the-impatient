package C21

import util.MyTestsSuite

class ex13Test extends MyTestsSuite {

  test("cbf str") {
    val toUpper = (x: Char) => x.toUpper
    val x: String = "abc".map(toUpper)
    x should ===("ABC")
  }

  test("cbf vec") {
    val charToInt = (c: Char) => c.toInt
    val x: IndexedSeq[Int] = "abc".map(charToInt)
    x should ===(Vector(97, 98, 99))
  }
}
