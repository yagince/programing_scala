package collection.sequence

object RichStringSamples {
  def main(args: Array[String]) {
	println(hasUpperCase(""))
	println(hasUpperCase("Hoge"))
	println(hasUpperCase("hoge"))
	println(hasUpperCase("foo foo"))
  }
  // #existsというメソッドはStringは持っていない
  // PredefがStringを暗黙的にRichStringに変換（RichString#existsは存在する）し
  // RickStringは文字列をSeq[Char]として扱う。
  def hasUpperCase(str: String) = str.exists(_.isUpperCase)
}