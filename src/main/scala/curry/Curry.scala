package curry

object Curry {
	def main(args: Array[String]) {
		val s = curriedSum(1) {
		  2
		}
		println(s)
	}
	def curriedSum(x: Int)(f: => Int) = x + f
}