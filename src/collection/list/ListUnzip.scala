package collection.list

object ListUnzip extends ListSample {
  def main(args: Array[String]) {
	val zipped = words zip sample
	println(zipped)
	val unzip = List.unzip(zipped)
	println(unzip)
	println(unzip._1)
	println(unzip._2)
  }
  
  def words = List("a","b","c","d","e","f")
}