package C05

// Ex 01
class Counter(private var value: Int = 0) {
  def increment(): Unit = if (value < Int.MaxValue) value += 1
  def current: Int = value
}
