package case_class_pattern_match

object VariablePattern {
	def main(args: Array[String]) {
		hoge(0)
		hoge(1)
	}
	def hoge(x: Any) = x match {
	  case 0 => println("zero")
	  case something => println("not zero : " + something)
	}
}