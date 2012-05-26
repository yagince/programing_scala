package case_class_pattern_match

object TypePattern {
  def main(args: Array[String]) {
	  generalSize("abc")
	  generalSize(Map(1 -> "a", "n" -> "b"))
  }
  def generalSize(x: Any) = x match {
    case m: Map[_, _] => println(m.size)
    case ary: Array[String] => println(ary.length)
    case _ => println(-1)
  }
}
