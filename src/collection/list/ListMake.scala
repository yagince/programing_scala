package collection.list

object ListMake {
  def main(args: Array[String]) {
	val list1 = List.make(5, "a")
	println(list1)
	
	val list2 = List.make(2, new Hoge("name")) // ���X�g�̗v�f���S�ē����I�u�W�F�N�g���Q�Ƃ��鎖�ɂȂ�
	list2.foreach((v) => println(v.toString))
	list2.foreach((v) => v.name += "hoge")
	list2.foreach((v) => println(v.name))
  }
  
  class Hoge(var name: String)
}