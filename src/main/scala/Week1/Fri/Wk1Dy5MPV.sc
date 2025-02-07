/**
 Functions, Methods, & For comprehensions MPV
 */

//Q1 Write a method to calculate the square of an Int. It should have an input parameter, Int and return type Int.

//Methods have 'def' in them or start with 'def'
  //Must be given a name e.g squareOfAnInt

def squareOfAnInt (number:Int): Int = number * number
squareOfAnInt(6)
squareOfAnInt(64)

//Q2 Write a method to check if a number is odd. It should have an input parameter, Int and return type Boolean.


def isOdd (number:Int): Boolean = number % 2 == 1
isOdd(7)
isOdd(2)


//def isNumberOdd (number: Int): Int = number % 2 != 0
//}
//isNumberOdd(2)

////val vat: Double = 1.2 //times by 1.2 anything we purchase, price of the item *VAT
////Make a method :
////we dont need {} if 1 only thing
//def priceIncVat(priceOfItem: Double): Double =
//  priceOfItem * vat //don't need {} if only 1 line
////run it
//priceIncVat(3.99)


//Q3