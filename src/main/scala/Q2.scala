object Q2 {
  def filterList(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inList = List("apple", "banana", "cherry", "date", "elephant", "fig")
    val filteredList = filterList(inList)
    println(filteredList)
  }

}
