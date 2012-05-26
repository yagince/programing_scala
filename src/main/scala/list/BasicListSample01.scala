package list

object BasicListSample01 {
  def main(args: Array[String]) {
    val list: List[Int] = List(1, 2, 3)
    val list2 = 0 :: list
    println(list2)
    
    println(list ::: list2)
    
    val list3 = list ::: List(4)
    println(list3)
  }
}