package abstract_members

object AbstractValSample01{
  def main(args: Array[String]) {
	new RationalTrait {
	  val numerArg = 1
	  val denomArg = 2
	} // 実行時エラー
	// 抽象valの初期化は具象クラスの初期化後に行われる為、RationalTraitの初期化時は０の為
	
  }
}