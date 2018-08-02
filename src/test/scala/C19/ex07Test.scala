package C19

import ch19.ex07
import util.MyTestsSuite

class ex07Test extends MyTestsSuite {

  class Closeable() {
    def close() {
      println("Closed!")
    }
  }

  def foo(c: Closeable): Int = {
    println(s"Processing: $c")
    123
  }

  test("closeable") {
    val r = ex07.processCloseable(new Closeable(), foo)
    assert(r == 123)
  }

}
