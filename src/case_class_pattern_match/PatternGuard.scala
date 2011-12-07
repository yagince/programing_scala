package case_class_pattern_match

object PatternGuard {
  def main(args: Array[String]) {
	  println(simplifyAdd(BinOp("+", Number(1), Number(1))))
  }
  def simplifyAdd(e: Expr) = e match {
	// �ϐ��p�^�[���͓�������O�ł͎g���Ȃ��ׁA�Ⴄ���O�ɂ��邪if�œ������Ƃ�ۏ؂��Ă���
    case BinOp("+", x ,y) if x == y => BinOp("*", x, Number(2)) // �������̉��Z�́~�Q�Ɠ����Ӗ�
    case _ => e
  }
}