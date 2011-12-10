package collection.set_and_map
import scala.collection.immutable.TreeSet
import scala.collection.immutable.TreeMap
import scala.collection.immutable.Map

object SortedSamples {
  def main(args: Array[String]) {
    val tSet = TreeSet(9,3,2,4,5,7,6,8,1)
    println(tSet)
    println(TreeSet('j','a','u'))
    
    var tm = TreeMap(3 -> 'x', 1 -> "hoge")
    println(tm)
    tm += (2 -> 1)
    println(tm)
    println(tm(1).getClass())
    println(tm(2).getClass())
    println(tm(3).getClass())
    
    val map = Map(1 -> 'x', 2 -> 1, "3" -> "hoge") // 型パラメータを指定しないと、型が違ってもエラーにならないんだ、、、Runtimeエラーにもならんとは
    println(map)
    map.keys.foreach(x => println(x.getClass()))
    
  }
}