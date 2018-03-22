package C03

object Ex04 {
  def partitionOdd(arr: Array[Int]): Array[Int] = {
    val tuple = arr.partition(_ > 0)
    tuple._1 ++ tuple._2
  }
}
