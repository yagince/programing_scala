package case_class_pattern_match

import Math.{ E, Pi }

object Example03 {
  def main(args: Array[String]) {
	  E match {
	  	case Pi => println("hoge")
	  	case pi => println("hogehoge" + pi)
	  }	
	  E match {
	  	case pi => println("hoge => " + pi)
//	  	case _ => println("")
	  }
	  val pi = 0
	  E match {
	  	case `pi` => println("hoge => " + pi)
	  	case pi => println("hoge" + pi)
	  }	
  }
}