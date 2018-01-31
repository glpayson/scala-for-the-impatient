package C03

object Ex05 {
  def average(arr: Array[Double]): Double = {
    if (arr.length == 0) 0.0 else arr.sum / arr.length
  }
}
