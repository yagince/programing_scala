package case_class_pattern_match

object ContructorPattern {
  def main(args: Array[String]) {
    // �R���X�g���N�^�p�^�[��
    val expr = BinOp("+", Number(1), Number(2))
    expr match {
      case BinOp("+", e, Number(0)) => println("a deep match : " + e)
      case _ => println("something")
    }
    val list = List(0, 1, 2)
    //�@�Œ蒷�̃V�[�P���X�p�^�[��
    list match {
      case List(0, _, _) => println("Yes matched. ")
      case _ => println("something")
    }
    // �ϒ�
    list match {
      case List(0, _*) => println("Matched!!")
      case _ => println("something")
    }
    // �Ȃ�ł�����
    list match {
      case List(_*) => println("�ǁ[��Ȉ����ł�OK")
    }
  }
}