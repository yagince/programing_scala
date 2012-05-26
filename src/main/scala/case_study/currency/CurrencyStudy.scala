package case_study.currency

object CurrencyStudy {
  def main(args: Array[String]) {
    println(US.make(5))
  }
}

abstract class CurrencyZone {
  type Currency <: AbstractCurrency
  def make(amount: Long): Currency

  abstract class AbstractCurrency {
    val amount: Long
    def designation: String
    override def toString() = amount + " " + designation
    // Scalaの抽象型はインスタンスを生成できない new Currencyは×
    def +(that: Currency): Currency =
      make(this.amount + that.amount)
    def *(x: Double): Currency =
      make((this.amount * x).toLong)
  }
}

object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"
  }
  type Currency = Dollar
  def make(x: Long) = new Dollar { val amount = x }
}