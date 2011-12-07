package trait_sample

object Sample01 {
  def main(args: Array[String]) {
	val frog = new Frog
	frog.philosophize()
  }
}

trait Philosophical {
  def philosophize() {
    println("philo")
  }
}
class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}

 