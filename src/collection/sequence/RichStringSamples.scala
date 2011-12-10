package collection.sequence

object RichStringSamples {
  def main(args: Array[String]) {
	println(hasUpperCase(""))
	println(hasUpperCase("Hoge"))
	println(hasUpperCase("hoge"))
	println(hasUpperCase("foo foo"))
  }
  def hasUpperCase(str: String) = str.exists(_.isUpperCase)
}