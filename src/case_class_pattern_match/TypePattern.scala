package case_class_pattern_match

object TypePattern {
  def main(args: Array[String]) {
	  generalSize("abc")
	  generalSize(Map(1 -> "a", "n" -> "b"))
  }
  def generalSize(x: Any) = x match {
    case s: String => println(s.length) // x��String�ɃL���X�g����K�v�͖���
    case m: Map[_, _] => println(m.size) // Scala��Java���l�A���s���Ɍ^���͎����Ă��Ȃ��̂ŁA�^�w��ł��Ȃ�
    case ary: Array[String] => println(ary.length) // �z�񂾂��͓��ʈ���
    case _ => println(-1)
  }
}