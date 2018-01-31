package C02

object Ex06 {
  def unicodeProd(s: String): Long = {
    var prod: Long = 1
    for (c <- s) prod *= c
    prod
  }
}
