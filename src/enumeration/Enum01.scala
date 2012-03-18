package enumeration

object Enum01 {
  def main(args: Array[String]) {
	for (d <- Color.values) println( d.id + " : " + d )
  }
}

object Color extends Enumeration {
  val Red, Green, Blue = Value
}
