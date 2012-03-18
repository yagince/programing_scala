package java_sample

object Sample02 {
  def main(args: Array[String]) {
	val map = Map("hoge" -> "HOGE", "foo" -> null)
	println(map.get("hoge"))
	println(map.get("foo"))
	println(map.get("bar"))
	
	println(value(map.get("hoge")))
	println(value(map.get("foo")))
	println(value(map.get("bar")))
  }
  
  def value(op: Option[String]) = op match {
    case Some(s) => s
    case None => "Default"
  } 
}