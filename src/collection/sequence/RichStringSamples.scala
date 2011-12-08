package collection.sequence

object RichStringSamples {
  def main(args: Array[String]) {
	println(hasUpperCase(""))
	println(hasUpperCase("Hoge"))
	println(hasUpperCase("hoge"))
	println(hasUpperCase("foo foo"))
  }
  // #exists�Ƃ������\�b�h��String�͎����Ă��Ȃ�
  // Predef��String���ÖٓI��RichString�ɕϊ��iRichString#exists�͑��݂���j��
  // RickString�͕������Seq[Char]�Ƃ��Ĉ����B
  def hasUpperCase(str: String) = str.exists(_.isUpperCase)
}