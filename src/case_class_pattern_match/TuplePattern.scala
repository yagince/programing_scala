package case_class_pattern_match

object TuplePattern {
  def main(args: Array[String]) {
	tupleDemo((1,2,3))
  }
  def tupleDemo(x: Any) = x match {
    case (a, b, c) => println(<hoge>matched : {a} {b} {c}</hoge>) // xmlŽ®‚¾‚¯‚ÍŽ®“WŠJ‚Å‚«‚é‚ñ‚¾‚Ë
  }
}