package implicit_conversions_and_parameters

// コンパニオンオブジェクトにimplicit関数を定義するパターン
object Implicit02 {
  def main(args: Array[String]) {
	new ImplicitTest().doTest
  }
}

class Hoge(val name: String) {
  def nameNameName = name * 3
}
class Bar(val name: String) {
  def nameNameName = {name + " です"}
}

class Foo(val name: String)
object Foo {
  implicit def fooToHoge(foo: Foo) = { println("FooをHogeに変換"); new Hoge(foo.name) }
  //implicit def fooToBar(foo: Foo) = { println("FooをBarに変換"); new Bar(foo.name) } // これがあると、どちらに変換するのかわからないので、コンパイルエラーになる。
}

class ImplicitTest {
  def sample(hoge: Hoge) = println(hoge.name)
  def doTest = {
    sample(new Foo("Foo's name"))
    
    println(new Foo("foo").nameNameName)
  }
}