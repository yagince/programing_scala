package case_class_pattern_match

object ConstantPattern {
	def main(args: Array[String]) {
		println(describe(5))
		println(describe(true))
		println(describe("hoge"))
	}
	def describe(x: Any) = x match {
	  case 5 => "five"
	  case true => "true!!!"
	  case "hello" => "Hi!"
	  case Nil => "empty"
	  case _ => "something"
	}
}