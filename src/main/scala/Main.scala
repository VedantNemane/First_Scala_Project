import java.text.NumberFormat._
import Items._

object Main {

  // Main function used for testing
  def main(args: Array[String]): Unit =
    println(s"The final price of your shopping is ${calculatePrice(List("Apple", "Apple", "Orange", "Apple"))}")


  /**
   * @param input - list of strings consisting of items to be purchased
   * @return      - total bill amount (as a string)
   */
  def calculatePrice(input: List[String]): String =
    getCurrencyInstance.format(input.map(item => get_item_price(item)).sum - calculateAllDiscounts(input))

  /**
   * @param input - pass in list of strings to identify the total discount amount across all items
   * @return      - the sum of all discounts for all items
   */
  def calculateAllDiscounts(input: List[String]): Double =
    calculateDiscount("Apple", input.count(_ == "Apple")) + calculateDiscount("Orange", input.count(_ == "Orange"))

  /**
   * @param item      - each item is mapped to an offer value
   * @param itemCount - how much of each item is present in the list to find the total discount
   * @return
   */
  def calculateDiscount(item: String, itemCount: Int): Double = {
    (itemCount / get_item_discount(item)) * get_item_price(item)
  }
}

