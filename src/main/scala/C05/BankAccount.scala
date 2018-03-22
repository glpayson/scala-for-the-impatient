package C05

// Ex 02
class BankAccount {
  private var balance = 0
  def currentBalance: Int = balance
  def deposit(amount: Int): Unit = balance += amount
  def withdraw(amount: Int): Unit = if (amount <= currentBalance) balance -= amount
}
