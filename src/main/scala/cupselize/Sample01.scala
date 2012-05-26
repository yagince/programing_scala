package cupselize

object Sample01 {
  def main(args: Array[String]) {
//    val queue = new Queue(List(1,2), List(3))
    val queue = Queue(1,2,3,4)
//    doesCompile(queue) // queueはQueue[Int]の為、Queue[Any]としては渡せない
    val queue2 = Queue(1,"2")
    doesCompile(queue2)
    
    val a1 = Array("a")
//    val a2: Array[Any] = a1 // Scalaの配列は共変では無い為、代入できない
    val a3: Array[Object] = a1.asInstanceOf[Array[Object]] // スーパークラス型の配列にキャストできる
    
  }
  
  def doesCompile(q: Queue[Any]) { println(q.toString) }
}