package ch19

object ex06 {
  def search(ints: Array[Int], target: Int): Int Either Int = {
    var index = 0
    while (index < ints.length && ints(index) < target) {
      index += 1
    }
    if (index == ints.length) Right(index)
    else if (target == ints(index)) Left(index)
    else Right(index)
  }
}