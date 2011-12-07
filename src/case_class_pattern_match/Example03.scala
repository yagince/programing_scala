package case_class_pattern_match

import Math.{ E, Pi }

object Example03 {
  def main(args: Array[String]) {
	  E match {
	  	case Pi => println("���₢��A����͂Ȃ�������")
	  	case pi => println("����͕ϐ��p�^�[���Ȃ񂾂�� => " + pi)
	  }	
	  E match {
	  	case pi => println("����͕ϐ��p�^�[���Ȃ񂾂�� => " + pi)
//	  	case _ => println("����͎��s����Ȃ�") // ����͉i���Ɏ��s����Ȃ��̂ŁA�R���p�C���G���[
	  }
	  val pi = 0
	  E match {
	  	case `pi` => println("����̓��[�J���ϐ��ɂȂ�� => " + pi) // ����pi�̓��[�J���ϐ���pi�Ȃ̂Łu0�v
	  	case pi => println("����͕ϐ��p�^�[���@���� " + pi) // ����pi�͕ϐ��p�^�[����pi�Ȃ̂�E
	  }	
  }
}