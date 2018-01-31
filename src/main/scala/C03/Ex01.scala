package C03

object Ex01 {
  def randomArray(n: Int): Array[Int] = {
    val array = new Array[Int](n)
    val rand = new scala.util.Random
    0 until n foreach (i => array(i) = rand.nextInt(n))
    array
  }
}
