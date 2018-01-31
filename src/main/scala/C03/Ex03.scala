package C03

object Ex03 {

  def shiftArray2(arr: Array[Int]): Array[Int] = {
    (for (x <- arr.grouped(2)) yield x.reverse).toArray.flatten
  }
}
