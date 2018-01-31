package C02

object Ex01 {
  def signum(x: Int): Int = {
    if (x < 0) -1
    else if (x == 0) 0 else 1
  }
}
