package collection.list

object HighOrderFunctions extends ListSample {
  def main(args: Array[String]) {
    // map
    val list1 = List(1, 2, 3) map (_ + 1)
    println(list1)

    // flatmap
    val flatMap = List.range(1,5) flatMap (i => List.range(1,i) map (j => (i,j)))
    println(flatMap)
    
    // filter
    val filteredList = list filter (_ % 2 == 0)
    println(filteredList)
    
    // partition
    val partitionedList = list partition(_ % 2 == 0)
    println(partitionedList)
    
    // find 指定した条件の最初に見つかった要素を返す(Option)
    val firstFind = list find (i => i % 2 == 0)
    println(firstFind) // Some(2)
    val notFound = list find (_ > 5)
    println(notFound) // None
    
    // takeWhile, dropWhile
    val take = List(1,2,3,-4,5) takeWhile(_ < 0)
    println(take)
    val drop = List(1,2,3,-4,5) dropWhile(_ > 0)
    println(drop)
    
    // forall exists
    val all = list forall (_ > 0)
    println(all)
    val exists = list exists(_ < 0)
    println(exists)
    
    // 畳込み リストの要素を何らかの演算子で結合していく
    // /:
    println(sum(list))
    println(product(list))
    println(joinLeft(list, ",")) // ((op(a, z), b), c)
    // :/ 
    println(joinRight(list, ",")) // op(a, op(b, op(c, z)))

  }
  def list = sample
  def sum(xs: List[Int]) = (0 /: xs) (_ + _)
  def product(xs: List[Int]) = (1 /: xs) (_ * _)
  def joinLeft(xs: List[Any], separator: String) = (xs.head /: xs.tail) (_.toString + separator + _.toString) // これはRubyの方が簡単に書ける
  def joinRight(xs: List[Any], separator: String) = (xs.init :\ xs.last) (_.toString + separator + _.toString) // これはRubyの方が簡単に書ける
}