package statefull

object Sample02 {
  def main(args: Array[String]) {
	val hoge = new Hoge(2)
	println(hoge.x)
	println(hoge.x = 100)
	println(hoge.x)
	val hoge2 = new Hoge2
	println(hoge2.x)
	println(hoge2.x = 102)
	println(hoge2.x)
	
	val thermometer = new Thermometer
	thermometer.celsius = 200 // 公開変数なので代入可能
	thermometer.fahrenheit = -40 // セッターが定義されているので、代入のような書き方が出来る
	println(thermometer)
  }
}

// x（ゲッター） x_=（セッター） が生成される
class Hoge(var x: Int)
class Hoge2 { var x = 10 }

class Time {
  var hour = 12
  var minute = 0
}

// 直接セッターゲッターを定義する方法
class Time_2 {
  private[this] var h = 12
  private[this] var m = 12
  def hour = h
  def hour_= (x: Int) {
    require(x >= 0 && x < 24, x)
    h = x 
  }
  def minute = m
  def minute_= (x: Int) {
    require(0 <= x && x < 60, x)
    m = x
  }
}

class Thermometer {
  var celsius: Float = _
  def fahrenheit = celsius * 9 / 5 + 32
  def fahrenheit_= (f: Float){
    celsius = (f - 32) * 5 / 9
  }
  override def toString = fahrenheit + "F/" + celsius + "C"
}