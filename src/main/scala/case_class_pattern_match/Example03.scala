package case_class_pattern_match

import Math.{ E, Pi }

object Example03 {
  def main(args: Array[String]) {
	  E match {
	  	case Pi => println("これは束縛されてない")
	  	case pi => println("これは変数に束縛されてる => " + pi)
	  }	
	  E match {
	    case pi => println("hoge")
//	  	case _ => println("ここまで到達しないので、エラー")
	  }
	  val pi = 0
	  E match {
	  	case `pi` => println("バッククオートはローカル変数 => " + pi)
	  	case pi => println("hoge" + pi) 
	  }	
  }
}
