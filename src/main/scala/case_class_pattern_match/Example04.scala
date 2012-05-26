package case_class_pattern_match

object Example04 {
  def main(args: Array[String]) {
	  val myTuple = (1, "hoge")
	  val (num, str) = myTuple
	  println(num)
	  println(str)
	  
	  val exp = BinOp("+", Number(1), UnOp("-", Number(2)))
	  val BinOp(operator, first, second) = exp
	  println(operator)
	  println(first)
	  println(second)
  }
}