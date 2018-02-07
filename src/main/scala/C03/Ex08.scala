package C03

import scala.collection.mutable.ArrayBuffer

object Ex08 {
  def dropFirstNegative(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var positionsToRemove = for (i <- arr.indices if arr(i) < 0) yield i
    positionsToRemove = positionsToRemove.drop(1)
    positionsToRemove = positionsToRemove.reverse
    for(i <- positionsToRemove) arr.remove(i)
    arr
  }
}
