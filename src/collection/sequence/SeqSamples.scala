package collection.sequence
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.Queue
import scala.collection.mutable.{Queue => MutableQueue}

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
	val has1 = Queue(1) // immutable
	val has12 = has1.enqueue(2)
	val has1234 = has12.enqueue(List(3,4))
	println(has1234.dequeue)
	println(has1234.dequeue._2.dequeue)
	println(has1234.dequeue._2.dequeue._2.dequeue)
	println(has1234.dequeue._2.dequeue._2.dequeue._2.dequeue)
	val muttableQueue = new MutableQueue[Int]
	muttableQueue.enqueue(1)
	muttableQueue += 2
	muttableQueue ++= List(3,4)
	muttableQueue ++= Array(5,6)
	println(muttableQueue.dequeue)
	println(muttableQueue.dequeue)
	println(muttableQueue.dequeue)
	println(muttableQueue.dequeue)
	println(muttableQueue.dequeue)
	println(muttableQueue.dequeue)
	
  }
}