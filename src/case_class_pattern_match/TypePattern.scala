package case_class_pattern_match

object TypePattern {
  def main(args: Array[String]) {
	  generalSize("abc")
	  generalSize(Map(1 -> "a", "n" -> "b"))
  }
  def generalSize(x: Any) = x match {
    case s: String => println(s.length) // xをStringにキャストする必要は無い
    case m: Map[_, _] => println(m.size) // ScalaもJava同様、実行時に型情報は持っていないので、型指定できない
    case ary: Array[String] => println(ary.length) // 配列だけは特別扱い
    case _ => println(-1)
  }
}