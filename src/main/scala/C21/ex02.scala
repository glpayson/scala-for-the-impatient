package C21

object ex02 {

  implicit final class IntWithPercent(val x: Int) extends AnyVal {
    def +%(percent: Int): Int = x + (x * percent / 100)
  }


  //  implicit final class FractionalWithPercent[T: Fractional](val x: T) {
  //    def +%(percent: T)(implicit fractional: Fractional[T]): T = {
  //      import fractional._
  //      plus(x, div(times(x, percent), fromInt(100)))
  //    }
  //  }

}
