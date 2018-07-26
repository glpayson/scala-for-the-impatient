package C21

import java.awt.Point

object ex06 {

  implicit object PointLexicographicOrdering extends Ordering[Point] {
    override def compare(x: Point, y: Point): Int = {
      val compareX = x.x - y.x
      if (compareX != 0) compareX
      else x.y - y.y
    }
  }

  //  Alternatively:
  //    override def compare(x: Point, y: Point): Int =
  //      Ordering.by((p: Point) => (p.x, p.y))
  //        .compare(x, y)
}
