package C02

object Ex10 {
  def power(x: Integer, n: Integer): Double = {
    n match {
      case y if n > 0 && n % 2 == 0 => power(x, y / 2) * power(x, y / 2)
      case n if n > 0 => x * power(x, n - 1)
      case y if n < 0 => 1 / power(x, -y)
      case _ => 1
    }
  }
}
