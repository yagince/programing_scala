package case_class_pattern_match

object WildcardPattern {
	def main(args: Array[String]) {
		val expr = BinOp("-", Var("1"), Var("2"))
		
		expr match {
			case BinOp(_, _, _) => println("Hey!")
			case _ => println("No...")
		}
	}
}