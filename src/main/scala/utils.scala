import scala.annotation.tailrec

object utils {

  def matchingCase(x:Int): String = x match {

    // if value of x is 0,
    // this case will be executed
    case 0 => "Hello, Teams!!"

    // if value of x is 1,
    // this case will be executed
    case 1 => "Are you  ready to learn Scala?"

    // if x doesnt match any sequence,
    // then this case will be executed
    case _ => "Good Luck!!"
  }


  // factoriel
  def factoriel1(n: Int): Int =
  {
    if (n == 0)
      1
    else
      n * factoriel1(n-1)
  }

  def factoriel2(n: Int): Int = (1 to n).product
  // factoriel tail recursives

  @tailrec
  def factTailRec(n: Int, acc: Int): Int = n match {
    case 0 => acc
    case _ => factTailRec(n - 1, n * acc)
  }

  def pgcd(a:Int, b:Int): Int = {
    if (b==0) a
    else
      pgcd(b, a%b)
  }

  def is_prime(n: Int): Boolean = {
    (2 until n).forall(k ⇒ n % k != 0)
  }

  def count_even(s: Set[Int]): Int = {
    def is_even(k: Int): Int = if (k % 2 == 0) 1 else 0

    s.toSeq.map(k ⇒ is_even(k)).sum
  }

  def count_even_using_val(s: Set[Int]): Int = {
    val is_even = (k: Int) ⇒ if (k % 2 == 0) 1 else 0

    // Need to convert a `Set[Int]` to a sequence (`Seq[Int]`), or else `map` does not work correctly!
    s.toSeq.map(k ⇒ is_even(k)).sum
  }

  def boucleFor():Unit ={
    for( w <- 0 to 10)
    {
      println(w);
    }
  }
}
