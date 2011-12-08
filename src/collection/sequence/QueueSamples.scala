package collection.sequence
import scala.collection.immutable.Queue
import scala.collection.mutable.{Queue => MutableQueue}

object QueueSamples {
  def main(args: Array[String]) {
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