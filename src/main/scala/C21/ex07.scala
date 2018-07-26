package C21

import java.awt.Point

object ex07 {

  implicit object PointDistanceOrdering extends Ordering[Point] {
    override def compare(x: Point, y: Point): Int = {
      val distanceX = distance(x.x, x.y)
      val distanceY = distance(y.x, y.y)
      math.round(distanceX - distanceY).toInt
    }
  }

  private def distance(x: Int, y: Int): Double = math.sqrt((x * x) + (y * y))

}
