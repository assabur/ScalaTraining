class Myrank (first :String,second :String) {
  val Myfirst  = first
  var Mysecond  = second
  def showFirst:Unit =
  {
    println(Myfirst);
  }

  def showSecond:Unit =
  {
    println(Mysecond);
  }

}
object Myrank  {
  var obj = new Myrank("Naimatou","Salimatou");
}