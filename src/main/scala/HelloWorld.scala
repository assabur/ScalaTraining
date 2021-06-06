object HelloWorld {

  def computeMessage(): String = "Bienvenue à la Team des\t"

  def computeText(): String = "\tpour un coding live  "

  def computeNumber(): Int = 4

  def main(args: Array[String]): Unit = {
    val message = computeMessage()
    val number = computeNumber()
    val text = computeText()
    println(message + number + text)
  }
}