package C05

// Ex 07
class Person2(name: String) {
  private val splitName = name.split(" ")
  val firstName = splitName(0)
  val lastName = splitName(1)
}
