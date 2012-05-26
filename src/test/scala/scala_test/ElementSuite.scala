package scala_test
import org.scalatest.Suites
import sample01.Element.elem

class ElementSuite extends Suites{
  def testUniformElement {
    val ele = elem('x',2,3)
    assert(ele.width == 2)
  }
}