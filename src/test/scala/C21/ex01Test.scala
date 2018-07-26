package C21

import util.MyTestsSuite

class ex01Test extends MyTestsSuite {

  test("arrow") {
    // val x: (_root_.java.lang.String, Int) = ArrowAssoc("a").->(1)
    val x: (String, Int) = "a" -> 1
    x should ===("a", 1)
  }
}
