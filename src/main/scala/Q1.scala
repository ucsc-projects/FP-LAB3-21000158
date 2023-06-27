object Q1 {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else if (str.length == 1) str
    else reverseString(str.substring(1)) + str.charAt(0).toString
  }

  def main(args: Array[String]): Unit = {
    val instr: String = "Hello UCSC"
    val reversedString = reverseString(instr)
    println(reversedString)
  }

}
