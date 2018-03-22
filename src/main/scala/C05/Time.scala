package C05

// Ex 03
class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    other.hours > this.hours ||
      (other.hours == this.hours && other.minutes > this.minutes)
  }
}
