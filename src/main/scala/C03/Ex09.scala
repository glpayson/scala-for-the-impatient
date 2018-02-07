package C03

import scala.collection.mutable.ArrayBuffer

object Ex09 {
  def dropFirstNegative2(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var positionsToRemove = for (i <- arr.indices if arr(i) < 0) yield (i, i + 1)
    positionsToRemove = positionsToRemove.drop(1)



    arr
  }
}
