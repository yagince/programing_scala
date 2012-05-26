package case_class_pattern_match

object PatternGuard {
  def main(args: Array[String]) {
	  println(simplifyAdd(BinOp("+", Number(1), Number(1))))
  }
  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x ,y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }
}