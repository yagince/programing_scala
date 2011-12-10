package case_class_pattern_match

object Example05 {
  def main(args: Array[String]) {
    val withDefault: Option[Int] => Int = {
      case Some(x) => x
      case None => 0
    }
    println(withDefault(Some(12)))
    println(withDefault(None))
    val withDefault2 = (x: Option[Int]) => {
      x match {
        case Some(x) => x
        case None => 0
      }
    }
    println(withDefault2(Some(12)))
    println(withDefault2(None))
    
    val second: List[Int] => Int = {
      case x :: y :: _ => y
      case _ => -1
    }
    println(second(List(1,2,3)))
    println(second(List()))
    
    val secondPartial: PartialFunction[List[Int],Int] = {
      case x :: y :: _ => y
    }
    println(secondPartial.isDefinedAt(List(1,2,3)))
    println(secondPartial.isDefinedAt(List()))
  }
}