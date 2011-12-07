package case_class_pattern_match

object ContructorPattern {
  def main(args: Array[String]) {
    // コンストラクタパターン
    val expr = BinOp("+", Number(1), Number(2))
    expr match {
      case BinOp("+", e, Number(0)) => println("a deep match : " + e)
      case _ => println("something")
    }
    val list = List(0, 1, 2)
    //　固定長のシーケンスパターン
    list match {
      case List(0, _, _) => println("Yes matched. ")
      case _ => println("something")
    }
    // 可変長
    list match {
      case List(0, _*) => println("Matched!!")
      case _ => println("something")
    }
    // なんでもあり
    list match {
      case List(_*) => println("どーんな引数でもOK")
    }
  }
}