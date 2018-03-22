package C05

// Ex 10
class Employee {
  private var _name = ""
  var salary = 0.0
  def this(name: String, salary: Double) = {
    this()
    _name = name
    this.salary = salary
  }
  def name = _name
}

// ﻿https://stackoverflow.com/questions/10426146/constructors-in-scala-primary-auxiliary-default-primary/10999828#10999828
