package collection.list

object ListSort extends ListSample {
  def main(args: Array[String]) {
	val sort1 = sample sort((f, s) => f > s)
	println(sort1)
	
	val sort2 = words sort(_.length > _.length)
	println(sort2)
  }
  
  def words = List("hoge", "foo", "bar", "buzz")
}