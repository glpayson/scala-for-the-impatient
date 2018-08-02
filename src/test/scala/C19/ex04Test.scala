package C19

import ch19.ex04.Network
import util.MyTestsSuite

class ex04Test extends MyTestsSuite {

  test("Member.equals") {
    val chatter = new Network
    val myFace = new Network

    val chatterFred = chatter.join("Fred")
    val myFaceFred = myFace.join("Fred")

    assert(!chatterFred.equals(myFaceFred))
  }
}
