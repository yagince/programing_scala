package collection.initialize
import scala.collection.mutable
import scala.collection.immutable.TreeSet

object Sample {
  def main(args: Array[String]) {
	val stuff = mutable.Set[Any](42)
	// stuff += "abc" // コンパイルエラー。
	
	val colors = List(1,3,6,5,2,4)
//	val treeSet = TreeSet(colors) // これはできない
	val treeSet = TreeSet[String]() ++ colors
	println(treeSet)
	println(treeSet.toArray)
	println(treeSet.toList) // ソートされる（->元のリストとは順番が異なる）
	
	// mutable -> immutable
	val mutableSet = mutable.Set.empty ++ treeSet
	val immutableSet = Set.empty ++ mutableSet
	
	val mutaMap = mutable.Map("i" -> 1, "ii" -> 2)
	mutaMap("iii") = 3
	val immutaMap = Map.empty ++ mutaMap
	
  }
}