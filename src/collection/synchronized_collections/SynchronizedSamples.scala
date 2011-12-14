package collection.synchronized_collections
import scala.collection.mutable.{Map, HashMap, SynchronizedMap}

object SynchronizedSamples {
  def main(args: Array[String]) {
	val capital = makeMap
	println(capital("hoge"))
  }
  def makeMap: Map[String, String] = {
    new HashMap[String, String] with 
    SynchronizedMap[String, String] {
      override def default(key: String) = "default"
    }
  }
}