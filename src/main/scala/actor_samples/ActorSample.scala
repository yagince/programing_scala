package actor_samples
import scala.actors.Actor
import scala.actors.Actor._

object ActorSample extends App {
  // receive
  val actor_receive = actor {
    val res = receive {
      case i:Int =>
        println("receive message : " + i)
        i
    }
    println("res : " + res)
  }
  actor_receive ! 1
  actor_receive ! 2 // loopしてないので、こいつは無視
  
  // react
  val actor_react = actor {
    loop {
      react {
        case i: Int => 
          println("react message : " + i)
          reply(i)
      }
      println("hoge") // reactは制御を返さないのでここは評価されない
    }
  }
  actor_react ! 1000
  actor_react ! 9999
  var res = actor_react !? 10 // 結果を受け取る場合は同期(!?)でメッセージ送信
  println("reply response: " + res)
  
  // 非同期で結果を受け取り処理をさせる方法
  actor_react !! (111, {case i:Int => println("callback : " + i)})
}
