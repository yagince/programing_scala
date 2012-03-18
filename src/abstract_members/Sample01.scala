package abstract_members

object Sample01 {
  
}

trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  val current: T
}
class Concrete extends Abstract {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  val current = initial
}

abstract class Fruit {
  val v: String
  def m: String
}
abstract class Apple extends Fruit {
  val v: String = "apple"
  val m: String = "m_apple" // defで宣言されている場合はvalでorverrideする事ができる
}
abstract class BadApple extends Fruit {
//  def v: String = "badapple" // 抽象valで宣言されているメンバーはdefでorverirdeできない
  def m: String = "m_badapple"
}
