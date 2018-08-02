package C19

import ch19.ex06
import util.MyTestsSuite

class ex06Test extends MyTestsSuite {

  test("search: found") {
    val ints = Array(1, 3, 5)
    ex06.search(ints, 1) should ===(Left(0))
    ex06.search(ints, 3) should ===(Left(1))
    ex06.search(ints, 5) should ===(Left(2))
  }

  test("search: not found") {
    val ints = Array(1, 3, 5)
    ex06.search(ints, 0) should ===(Right(0))
    ex06.search(ints, 2) should ===(Right(1))
    ex06.search(ints, 4) should ===(Right(2))
    ex06.search(ints, 10) should ===(Right(3))
  }
}
