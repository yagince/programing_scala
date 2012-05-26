package option

object Example01 {
  def main(args: Array[String]) {
	  val map = Map("France" -> "Paris", "Japan" -> "Tokyo")
	  println(map get "France") // Some(Paris)
	  println(map get "America") // None
	  println(show(map.get("hoge")))
	  println(hoge.get)
  }
  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
  def hoge(): Option[String] = {
    Some("aaa")
//    None
  }
}