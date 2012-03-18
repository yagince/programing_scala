package cupselize

object Queue {
  def apply[T](xs: T*) = new Queue(xs.toList, Nil)
}
class Queue[T] private (
  private val leading: List[T],
  private val trailing: List[T]
)
