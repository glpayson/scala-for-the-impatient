package C05

// Ex 04
class Time2(hours: Int, minutes: Int) {
  private val min = hours * 60 + minutes
  def before(other: Time2): Boolean = this.min < other.min
}
