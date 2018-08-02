package C19

import ch19.ex08.Dim
import util.MyTestsSuite

class ex08Test extends MyTestsSuite {

  class Seconds(v: Double) extends Dim[Seconds](v, "s") {
    override protected def create(v: Double): Seconds = new Seconds(v)
  }

  // the following no longer compiles

  //  class Meters(v: Double) extends Dim[Seconds](v, "m") {
  //    override protected def create(v: Double): Seconds = new Seconds(v)
  //  }

  test("mixing s & m") {
    val s = new Seconds(3)
    println(s)
    //    val m = new Meters(10)
    //    println(m)
    //    val r = s + m
    //    println(r)
  }
}
