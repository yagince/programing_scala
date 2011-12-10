package case_class_pattern_match

sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object Example01 {
	def main(args: Array[String]) {
		val v = Var("x")
		
		val op = BinOp("+", Number(1), v) 
		println(v.name) 
		println(op.left)
		
		println(op)
		
		println(op.right == Var("x")) 
	}
	def hoge(x: Expr) = x match {
	  case Number(_) => "number"
	  case Var(_) => "variable"
	  case _ => "hoge"
	}
}