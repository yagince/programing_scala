package implicit_conversions_and_parameters

object Implicit03 {
  def main(args: Array[String]) {
    implicit val p = new PreferredPrompt("hoge〜★")
    // implicit val pr = new PreferredPrompt("hogehoge") // スコープ内に２つ以上、同じ型のimplicit-valがあると怒られる
    Greeter.greet("yagi")
  }
}

class PreferredPrompt(val preference: String)

object Greeter {
  def greet(name: String)(implicit prompt: PreferredPrompt) {
    println("Welcome, " + name + ". The system is ready.")
    println(prompt.preference)
  }
}