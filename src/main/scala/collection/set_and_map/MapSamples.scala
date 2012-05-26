package collection.set_and_map
import scala.collection.mutable

object MapSamples {
  def main(args: Array[String]) {
	val map = mutable.Map.empty[String, Int]
	map("hello") = 1
	map("hoge") = 2
	println(map("hello"))
	println(map("hoge"))
	// println(map("foo")) // java.util.NoSuchElementException
	
	println(count("Hoge hoge doo. I am Buzz! bar bar"))
  }
  def count(text: String) = {
    val counts = mutable.Map.empty[String, Int]
    text.split("[ ,!]+").foreach{(rawWord) =>
      val word = rawWord.toLowerCase
      val oldCount = 
        if (counts.contains(word)) counts(word)
        else 0
      counts += (word -> (oldCount + 1))
    }
    counts
  }
}