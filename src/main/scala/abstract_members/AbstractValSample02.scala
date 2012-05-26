package abstract_members

object AbstractValSample02 {
  def main(args: Array[String]) {
	val rational = new {
	  val numerArg = 1
	  val denomArg = 2
	} with RationalTrait
	println(rational.getClass())
	
//	val hoge = new { val x:Int = 10 }
//	println(hoge.x)
//	println(hoge.getClass())
	
	val rational2 = new RationalClass(1,2)
  }
}

class RationalClass(n: Int, d: Int) extends {
  val numerArg = n
  val denomArg = d
} with RationalTrait