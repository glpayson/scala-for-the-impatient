package C04

object Ex09 {
  def lteqgt(values: Array[Int], v: Int) : (Int, Int, Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }
}
