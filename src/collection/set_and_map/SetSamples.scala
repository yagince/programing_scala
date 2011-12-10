package collection.set_and_map
import scala.collection.mutable

object SetSamples {
  def main(args: Array[String]) {
	val text = "hoge hoge hoge hoge. Foo foo buzz. I am Bar"
	val wordsArray = text.split("[ !,.]+")
	
	val words = mutable.Set.empty[String]
	wordsArray.foreach(words += _)
	println(words)
	
	val imuSet = Set(1,2,3)
	val hoge = imuSet + "s"
	println(hoge.getClass()) // Stringを＋すると結果もStringになる。不思議。暗黙の型変換なのか？？
	println(imuSet + 4)
	println(imuSet - 3)
	println(imuSet ++ List(4,5,5))
	println(imuSet ++ Set(6,6,6,6))
	println(imuSet -- List(1,2,4))
	
  }
}