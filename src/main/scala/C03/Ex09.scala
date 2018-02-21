package C03

import scala.collection.mutable.ArrayBuffer

object Ex09 {


  def shift(arr: ArrayBuffer[Int], i: Int, negCount: Int) = {
    arr(i - negCount) = arr(i)
  }

  def dropFirstNegative2(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    val (head, tail) = arr.splitAt(arr.indexWhere(_ < 0) + 1)
    var negCount: Int = 0
    for (i <- tail.indices; e = Either.cond(tail(i) > 0, i, i))
      yield e.fold(_ => negCount += 1, shift(tail, _, negCount))
    head ++ tail.dropRight(negCount)
  }
}

//    var positionsToRemove = for (i <- arr.indices if arr(i) < 0) yield (i, i + 1)
//    positionsToRemove = positionsToRemove.drop(1)
