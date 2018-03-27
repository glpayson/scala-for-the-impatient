package C05

// Ex 06
class Person(var name: String = "", var age: Int = 0) {
  def description = s"$name is $age years old"
  val description2 = s"$name is $age years young"
  if(age < 0) age = 0
}
