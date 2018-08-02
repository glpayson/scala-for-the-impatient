package C19

import ch19.ex01._
import util.MyTestsSuite

class ex01Test extends MyTestsSuite {

  test("Bug") {
    val bugsy = new Bug()
    bugsy.move(4).show().move(6).show().turn().move(5).show()
  }
}
