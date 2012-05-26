package collection.list

object ListRange {
  def main(args: Array[String]) {

	val oneToFour = List.range(1,5)
	println(oneToFour)
	
	val step2 = List.range(1, 10, 2)
	println(step2)
	
	val step_minus3 = List.range(10, 1, -3)
	println(step_minus3)
	
	val hoge = List.range(1, 10, -1)
	println(hoge) 
  }
}
