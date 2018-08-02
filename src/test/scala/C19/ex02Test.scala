package C19

import util.MyTestsSuite

class ex02Test extends MyTestsSuite {

  test("FluentBug") {
    import ch19.ex02._

    val bugsy = new FluentBug
    bugsy move 4 and show and then move 6 and show turn around move 5 and show
  }
}
