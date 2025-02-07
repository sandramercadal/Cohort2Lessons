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
//solution needs an input parameter
isOdd(7)
isOdd(2)

//Q3 Use a For Comparison and the two methods I created above (squareOfAnInt & isOdd) to write a method sumOfOddNumbers.
//For comparison doesn't work with Int!!
// For comparison is a lightweight notation for expression of sequence comprehension/simplified way of writing a function.
//TYPES: Classic, Use operators or Use if guards.
// SYNTAX: Uses backward symbol e.g. for (numbers <- 1 to <-10) yield numbers  - and 2 symbols will appear between 'to'.
          //It will iterate over a List of Ints
          //Will square each Int in the List
          //WIll filter and keep only the odd squared values
          //Then, return the sum of these odd squared numbers.
          //It needs to have List [Int] and return type INT.
def squareOfAnInt (number:Int): Int = number * number
def isOdd (number:Int): Boolean = number % 2 == 1

def sumOfOddNumbers (List: Int): Int = {
  numbers
}


//def useIfGuard: Seq [Int] = for (number <-1 to 10 if number % 2 == 0 ) yield number
//useIfGuard
//runs if the numbers are odd
--------------------------------------------
for comp  structure :

def retrieveNumbers: Seq[Int] = for (number <- 1  to 10) yield number
retrieveNumbers
// (1 to 10 ).foreach (number => println (number))

//use operators
//squaring it
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
squaredNumbers


//Q4 Write a


/**
 // Research
 // */
//Pure and Impure Type up here :
