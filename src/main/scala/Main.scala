import java.text.NumberFormat._
import Items._

object Main {
  // Main function used for testing
  def main(args: Array[String]): Unit = {
    println(s"The final price of your shopping is ${calculatePrice(List("Apple", "Apple", "Orange", "Apple"))}")
  }

  /**
   * @param input - list of strings consisting of items to be purchased
   * @return - total bill amount
   */
  def calculatePrice(input: List[String]): String =
    getCurrencyInstance.format(input.map(item => get_item_price(item)).sum)
}