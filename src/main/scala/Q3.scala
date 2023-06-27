object Q3 {
  def calculateAverage(num1: Int, num2: Int): Double = {
    val sum = num1 + num2
    val mean = sum.toDouble / 2.0
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 6
    val num2 = 8
    val average = calculateAverage(num1, num2)
    println(average)
  }

}
