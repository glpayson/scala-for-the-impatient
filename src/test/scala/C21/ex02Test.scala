package C21

import util.MyTestsSuite

class ex02Test extends MyTestsSuite {

  test("percent") {
    import C21.ex02.IntWithPercent

    val x = 120 +% 10
    x should ===(132)
  }

  //  test("fractional with percent") {
  //    import C21.ex02.FractionalWithPercent
  //
  //    val x = 120.0 +% 0.5
  //    x should ===(120.6)
  //
  //    val y = 120 +% 10
  //    y should ===(132)
  //  }
}
