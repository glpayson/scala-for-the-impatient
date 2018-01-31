package C03

import scala.collection.mutable.ArrayBuffer

object Ex06 {
  def reverseSort(arr: Array[Int]): Array[Int] = {
    arr.sortWith(_ < _)
  }

  def reverseSort(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    arr.sortWith(_ < _)
  }
}
