package C21

import java.awt.Point

import util.MyTestsSuite

class ex07Test extends MyTestsSuite {

  test("comp distance") {
    val p1 = new Point(1, 4)
    val p2 = new Point(2, 2)

    import C21.ex07.PointDistanceOrdering

    Seq(p1, p2).sorted should contain theSameElementsInOrderAs Seq(p2, p1)
    Seq(p2, p1).sorted should contain theSameElementsInOrderAs Seq(p2, p1)
  }

  test("mixed orderings") {
    val p1 = new Point(1, 4)
    val p2 = new Point(2, 2)

    Seq(p1, p2).sorted(C21.ex06.PointLexicographicOrdering) should
      contain theSameElementsInOrderAs Seq(p1, p2)

    Seq(p1, p2).sorted(C21.ex07.PointDistanceOrdering) should
      contain theSameElementsInOrderAs Seq(p2, p1)
  }
}
