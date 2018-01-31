package C02

object Ex07 {
  def mapUnicodeProd(s: String): Long = {
    s.foldLeft(1L)(_*_)
  }
}
