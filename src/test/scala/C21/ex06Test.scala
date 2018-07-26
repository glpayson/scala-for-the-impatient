package C21

import java.awt.Point

import util.MyTestsSuite

class ex06Test extends MyTestsSuite {

  test("Lexicographic ordering") {
    val p1 = new Point(1, 3)
    val p2 = new Point(2, 2)

    import C21.ex06.PointLexicographicOrdering

    Seq(p1, p2).sorted should contain theSameElementsInOrderAs Seq(p1, p2)
    Seq(p2, p1).sorted should contain theSameElementsInOrderAs Seq(p1, p2)
  }
}
