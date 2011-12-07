package practice

class Sample01 {
  def show(fruits: Fruits) {
    import fruits._
    println(name + color)
  }
}