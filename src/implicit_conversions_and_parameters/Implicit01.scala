package implicit_conversions_and_parameters

object Implicit01 {
  def main(args: Array[String]) {
	val wrapper = stringWrapper("HogeHoge123")
	println(wrapper.exists(_.isDigit))
	
	//println("hoge123" exists (_.isDigit))
  }
  implicit def stringWrapper(s: String) = {
    new RandomAccessSeq[Char] {
      def length = s.length
      def apply(i: Int) = s.charAt(i)
    }
  }
}

