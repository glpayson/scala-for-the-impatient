package C02

object Ex09 {
  def recursiveUnicodeProd(s: String): Long = {
    if (s.isEmpty) 1
    else s.head * recursiveUnicodeProd(s.tail)
  }
}
