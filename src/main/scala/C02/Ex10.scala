package C02

object Ex10 {
  def power(x: Integer, n: Integer): Double = {
    n match {
      case y if n > 0 && n % 2 == 0 => power(x, y / 2) * power(x, y / 2)
      case y if n > 0 => x * power(x, y - 1)
      case y if n < 0 => 1 / power(x, -y)
      case _ => 1
    }
  }
}
