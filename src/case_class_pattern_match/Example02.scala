package case_class_pattern_match

object Example02 {
	def main(args: Array[String]) {
		println(simplifyTop(UnOp("-", UnOp("-", Var("n")))));
	}
	def simplifyTop(expr: Expr) : Expr = expr match {
	  case UnOp("-", UnOp("-", e)) => e
	  case BinOp("+", e, Number(0)) => e
	  case BinOp("*", e, Number(1)) => e
	  case _ => expr
	}	
}