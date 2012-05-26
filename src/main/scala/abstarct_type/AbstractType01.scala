package abstarct_type

object AbstractType01 {
  def main(args: Array[String]) {
	new Cow eat (new Grass)
  }
}

class Food
abstract class Animal {
  type SuitableFood <: Food // <: は上限境界
  def eat(food: SuitableFood)
}

class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  override def eat(food: Grass) {}
}
