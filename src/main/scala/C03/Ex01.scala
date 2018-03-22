package C03

import scala.util.Random

object Ex01 {
  val rand = new Random

  def randomArray(n: Int): Array[Int] = {
    (0 until n).map(_ => rand.nextInt(n)).toArray
  }
}
