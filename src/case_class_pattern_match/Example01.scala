package case_class_pattern_match

sealed abstract class Expr // sealedクラスは同じファイル以外でサブクラスを定義できない
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object Example01 {
	def main(args: Array[String]) {
		val v = Var("x") // caseが付くとファクトリメソッドが自動的に追加される
		
		val op = BinOp("+", Number(1), v) // ファクトリメソッドは入れ子になる場合に有用
		println(v.name) // caseクラスのコンストラクタ引数には自動的にvalが付くので、アクセス可能
		println(op.left)
		
		println(op)
		
		println(op.right == Var("x")) // caseクラスの場合、toString、hashCode、equalsの自然な実装が自動的に追加される
	}
	// Exprをsealedクラスにした為、不足しているパターンが警告される
	def hoge(x: Expr) = x match {
	  case Number(_) => "number"
	  case Var(_) => "variable"
	}
}