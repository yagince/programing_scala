package collection.sequence
import scala.collection.mutable.Stack
import scala.collection.immutable.{Stack => ImmutableStack}

object StackSamples {
  def main(args: Array[String]) {
	val stack = new Stack[Int]
	stack.push(1)
	stack.push(2)
	println("top : " + stack.top)
	println("pop : " + stack.pop)
	println("pop : " + stack.pop)
	
	val imStack = new ImmutableStack[Int]
	val has1 = imStack.push(1)
	println("imSt3ack : " + imStack)
	val has21 = has1.push(2)
	val has321 = has21.push(3)
	println(has321.pop2._1)
	println(has321.pop.pop2._1)
	println(has321.pop.pop.pop2._1)
  }
}