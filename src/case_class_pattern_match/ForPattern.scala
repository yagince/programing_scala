package case_class_pattern_match

object ForPattern {
  def main(args: Array[String]) {
    val map = Map(1 -> "1", 2 -> "2")
	for((key,value) <- map)
	  println("key:" + key + " value:" + value)
	  
	val list = List(Some(1), None, Some("hoge"))
	for(Some(x) <- list)
	  println(x) 
  }
}