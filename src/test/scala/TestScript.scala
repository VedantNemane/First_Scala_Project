import Main._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TestScript extends AnyFlatSpec{
  "calculatePrice " should " return £0.00 for a blank shopping list" in {
    calculatePrice(List()) should be("£0.00")
  }
  "calculatePrice " should " return £0.60 for one apple" in {
    calculatePrice(List("Apple")) should be("£0.60")
  }
  "calculatePrice " should " return £0.60 for two apples" in {
    calculatePrice(List("Apple", "Apple")) should be("£0.60")
  }
  "calculatePrice " should " return £1.20 for three apples" in {
    calculatePrice(List("Apple", "Apple", "Apple")) should be("£1.20")
  }
  "calculatePrice " should " return £0.25 for one orange" in {
    calculatePrice(List("Orange")) should be("£0.25")
  }
  "calculatePrice " should " return £0.50 for two oranges" in {
    calculatePrice(List("Orange", "Orange")) should be("£0.50")
  }
  "calculatePrice " should " return £0.50 for three oranges" in {
    calculatePrice(List("Orange", "Orange", "Orange")) should be("£0.50")
  }
  "calculatePrice " should " return £0.85 for an apple and an orange" in {
    calculatePrice(List("Apple", "Orange")) should be("£0.85")
  }
  "calculatePrice " should " return £1.70 for three apples and two oranges" in {
    calculatePrice(List("Apple", "Apple", "Orange", "Apple", "Orange")) should be("£1.70")
  }
  "calculatePrice " should " return £1.45 for three apples and an orange" in {
    calculatePrice(List("Apple", "Apple", "Orange", "Apple")) should be("£1.45")
  }
  "calculatePrice " should " return £1.70 for three apples and three oranges" in {
    calculatePrice(List("Apple", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange")) should be("£1.70")
  }
}
