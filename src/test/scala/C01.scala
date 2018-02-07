import org.scalatest.FunSuite

import scala.util.Random
import BigInt.probablePrime

//noinspection SpellCheckingInspection
class C01 extends FunSuite {
  test("ex_02") {
    println(math.pow(math.sqrt(3), 2))
  }

  test("ex_04") {
    assert("crazy" * 3 == "crazycrazycrazy")
  }

  test("ex_05") {
    assert((10 max 2) == 10)
  }

  test("ex_06") {
    println(BigInt(2) pow 1024)
  }

  test("ex_07") {
    println(probablePrime(100, Random))
  }

  test("ex_08") {
    val fileName = BigInt.probablePrime(100, Random) toString 36
    println(fileName)
  }

  test("ex_09") {
    val s = "hello sailor!"
    assert(s(1) == 'h')
    assert(s.last == '!')
  }

  test("ex_10") {
    val s = "hello sailor!"
    assert(s.take(5) == "hello")
    assert(s.dropRight(8) == "hello")
    assert(s.substring(0, 5) == "hello")

    assert(s.drop(6) == "sailor!")
    assert(s.takeRight(7) == "sailor!")
    assert(s.substring(6) == "sailor!")
  }
}
