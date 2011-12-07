package collection.sequence
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

object SeqSamples {
  def main(args: Array[String]) {
    // List
	val colors = List("red","blue","green")
	println(colors.head)
	println(colors.tail)
	
	// Array
	val fiveInts = new Array[Int](5)
	println(fiveInts.toList)
	println(new Array[String](2).toList) // StringÇÕèâä˙ílnull

	// ListBuffer 
	val buf = new ListBuffer[Int]
	buf += 1
	buf += 2
	println(3 +: buf)
	
	// ArrayBuffer
	val arrayBuf = new ArrayBuffer[Int]
	arrayBuf += 12
	println(arrayBuf)
	
	// Queue
	
  }
}