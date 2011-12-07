package case_class_pattern_match

import Math.{ E, Pi }

object Example03 {
  def main(args: Array[String]) {
	  E match {
	  	case Pi => println("いやいや、それはないっしょ")
	  	case pi => println("これは変数パターンなんだよね => " + pi)
	  }	
	  E match {
	  	case pi => println("これは変数パターンなんだよね => " + pi)
//	  	case _ => println("これは実行されない") // これは永遠に実行されないので、コンパイルエラー
	  }
	  val pi = 0
	  E match {
	  	case `pi` => println("これはローカル変数になるよ => " + pi) // このpiはローカル変数のpiなので「0」
	  	case pi => println("これは変数パターン　＝＞ " + pi) // このpiは変数パターンのpiなのでE
	  }	
  }
}