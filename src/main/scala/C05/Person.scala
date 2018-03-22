package C05

// Ex 06
class Person(var name: String = "", var age: Int = 0) {
  if(age < 0) age = 0
}
