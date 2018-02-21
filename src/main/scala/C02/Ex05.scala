package C02

object Ex05 {
  def countToTenProc(n: Int): Unit = {
    for (i <- (0 to n).reverse) {
      println(i)
    }
  }
}
