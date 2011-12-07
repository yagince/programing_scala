package case_class_pattern_match

object PatternGuard {
  def main(args: Array[String]) {
	  println(simplifyAdd(BinOp("+", Number(1), Number(1))))
  }
  def simplifyAdd(e: Expr) = e match {
	// 変数パターンは二個同じ名前では使えない為、違う名前にするがifで同じことを保証している
    case BinOp("+", x ,y) if x == y => BinOp("*", x, Number(2)) // 同じ数の加算は×２と同じ意味
    case _ => e
  }
}