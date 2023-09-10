object Items{
  /**
   * @param item - a shopping item to be billed against the pattern match function as shown. Assume that the input is a list of strings as mentioned in spec.
   * @return price - the price of the shopping item
   */
  def get_item_price(item: String): Double = item match{
    case "Apple" => 0.60
    case "Orange" => 0.25
    case _ => 0.00
  }
}
