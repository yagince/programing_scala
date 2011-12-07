package case_class_pattern_match

sealed abstract class Expr // sealed�N���X�͓����t�@�C���ȊO�ŃT�u�N���X���`�ł��Ȃ�
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object Example01 {
	def main(args: Array[String]) {
		val v = Var("x") // case���t���ƃt�@�N�g�����\�b�h�������I�ɒǉ������
		
		val op = BinOp("+", Number(1), v) // �t�@�N�g�����\�b�h�͓���q�ɂȂ�ꍇ�ɗL�p
		println(v.name) // case�N���X�̃R���X�g���N�^�����ɂ͎����I��val���t���̂ŁA�A�N�Z�X�\
		println(op.left)
		
		println(op)
		
		println(op.right == Var("x")) // case�N���X�̏ꍇ�AtoString�AhashCode�Aequals�̎��R�Ȏ����������I�ɒǉ������
	}
	// Expr��sealed�N���X�ɂ����ׁA�s�����Ă���p�^�[�����x�������
	def hoge(x: Expr) = x match {
	  case Number(_) => "number"
	  case Var(_) => "variable"
	}
}