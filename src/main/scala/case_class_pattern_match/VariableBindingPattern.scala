package case_class_pattern_match

object VariableBindingPattern {
  def main(args: Array[String]) {
	  hoge(UnOp("aaa", UnOp("bb", Var("b"))))
  }
  def hoge(x: Any) = x match {
    case UnOp(_, e @ UnOp(_, _)) => println(e)
    case _ => println("something")
  }
}