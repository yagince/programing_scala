package lazy_init

object Lazy01 {
  def main(args: Array[String]) {
    println("Normal initialize")
    println("===========================")
	Demo
    println("===========================")
	println(Demo.x)
    println("===========================")
    
    println("Lazy initialize")
    println("===========================")
	LazyDemo
    println("===========================")
	println(LazyDemo.x)
    println("===========================")
	println(LazyDemo.x)
    println("===========================")
    
  }
}

object Demo {
  val x = { println("hoge"); "done" }
}

object LazyDemo {
  lazy val x = { println("hoge"); "done" }
}