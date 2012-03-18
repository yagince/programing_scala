package statefull

object Sample01 {
  def main(args: Array[String]) {
	val account = new BankAccount
	println(account deposit 100)
	println(account withdraw 80)
	println(account withdraw 80) // 同じメソッドを同じ引数で呼び出して、結果が異なる。（＝ステートフル）
  }
}

class BankAccount {
  private var bal: Int = 0
  def balance: Int = bal
  def deposit(amount: Int) {
	require(amount > 0)
	bal += amount
  }
  def withdraw(amount: Int): Boolean = 
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
}