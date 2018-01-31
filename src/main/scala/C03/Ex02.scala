package C03

object Ex02 {
  def shiftArray(unshifted: Array[Int]): Array[Int] = {
    val shifted = new Array[Int](unshifted.length)
    for (i <- unshifted.indices by 2) {
      if (unshifted.length > i + 1) {
        shifted(i + 1) = unshifted(i)
        shifted(i) = unshifted(i + 1)
      } else {
        shifted(i) = unshifted(i)
      }
    }
    shifted
  }
}
