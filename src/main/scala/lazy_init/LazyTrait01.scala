package lazy_init

object LazyTrait01 {
  def main(args: Array[String]) {
	val x = 2
	val lazyRational = new LazyRationalTrait {
	  // ここで初期化しないと怒られる（コンパイルエラー）
	  val numerArg = 1 * x
	  val denomArg = 2 * x
	}
	println(lazyRational.toString)
  }
}