import org.scalatest.FunSuite
import C05.BankAccount
import C05.Car
import C05.Counter
import C05.Employee
import C05.Person
import C05.Person2
import C05.Student
import C05.Time
import C05.Time2

class C05 extends FunSuite{
  test("ex_01") {
    val target = new Counter(Int.MaxValue)
    target.increment()
    target.increment()
    target.increment()
    assert(Int.MaxValue == target.current)
  }

  test("ex_02") {
    val target = new BankAccount
    target.deposit(42)
    target.withdraw(20)
    assert(22 == target.currentBalance)
    target.withdraw(9001)
    assert(22 == target.currentBalance)
  }

  test("ex_03") {
    val target = new Time(11, 11)
    val other0 = new Time(11, 59)
    val other1 = new Time(13, 1)
    assert(target.before(other0))
    assert(target.before(other1))
  }

  test("ex_04") {
    val target = new Time2(11, 11)
    val other0 = new Time2(11, 59)
    val other1 = new Time2(13, 1)
    assert(target.before(other0))
    assert(target.before(other1))
  }

  test("ex_05") {
    val target = new Student("Foo Barington", 123)
    assert(123 == target.getId)
    assert("Foo Barington" == target.getName)
    target.setName("Bar Fooington")
    assert("Bar Fooington" == target.getName)
  }

  test("ex_06") {
    val target = new Person("Foo Barington", -42)
    assert(0 == target.age)
  }

  test("ex_07") {
    val target = new Person2("Foo Barington")
    assert("Foo" == target.firstName)
    assert("Barington" == target.lastName)
  }

  test("ex_08") {
    val car0 = new Car("DeLorean", "DCM-12", 1985, "OUTATIME")
    val car1 = new Car("DeLorean", "DCM-12")
    val car2 = new Car("DeLorean", "DCM-12", 1985)
    val car3 = new Car(manufacturer = "DeLorean", modelName = "DCM-12", licensePlate =  "OUTATIME")
  }

  test("ex_10") {
    val target = new Employee("Foo Barington", 42.00)
    assert("Foo Barington" == target.name)
    assert(42.00 == target.salary)
  }

}
