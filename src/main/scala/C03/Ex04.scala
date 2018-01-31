package C03

object Ex04 {
  def partitionOdd(arr: Array[Int]): Array[Int] = {
    arr.groupBy(_ % 2 != 0).values.flatten.toArray
  }
}
