
/**
 Functions, Methods, Referential transparancy, For comprehensions
 */
// Method step by step instructions on how to do something e.g make a cup of Tea
//Functions and methods both define specific steps. Can be reused in multiples places
//Logic is identical so hard to see if it's a method or a function!! Methods contain 'def' or start with 'def'

//Write an anonymous function
//=> you want it to do something
(number: Int) => number +1 //number is not declared

//As a val now:
//Given an int which is called number, I'm taking this Int and adding 1

//Named function only name when we want to reuse. We cannot override. Immutable.
val addition = (number: Int) => number +1

//DEF starts with the words def and syntax changes I need to tell it what I want within my name
def addition (number:Int): Int = number +1  //Method (also a type of function).Must be named.
// Named so can be reused.

//OVERRIDE key word is override so start with 'override'. You expect an Int which is a number
// and I wasn't you to tackle that number and add 10
//override def addition (number:Int): Int = number + 10

//Methods need to start with Def
//name should be unique def nameOfMethod. To run need to have a parameter: then needs ReturnType
//then { in here is the expressions if multiple }

val aValue = 6<3
def aDifferentValue: Int = {
  if (aValue) 564 else 865
  42 //last expression must match the methods return type
  //aValue is asking if this is true we are calling this method by its
  //name to be evaluated
}

aDifferentValue
aValue


//How to make a cup of coffee
//with empty parameter no need to use brackets
def makeACoffee: String = {
  "Add coffee to boiling water"
  "Add sugar or/and milk if required"
  "Stir"
  "Enjoy!" //this is green, recognised as the last one adn we will only get enjoy
}
makeACoffee //last expression returned

//Now with a parameter. Methods start with Def. name the parameeter when calling the method.
def makeATea(sugar:Int, splashesOfMilk: Int): String = {
  s"Add boiling water to your cup with a teabag, add $sugar spoons of sugar and $splashesOfMilk splashes of milk, stir and enjoy!"
}
makeATea(4, 6)
makeATea(sugar = 7, splashesOfMilk = 6)


//VAT
val vat: Double = 1.2 //times by 1.2 anything we purchase, price of the item *VAT
//Make a method :
//we dont need {} if 1 only thing
def priceIncVat(priceOfItem: Double): Double =
  priceOfItem * vat //don't need {} if only 1 line
//run it
priceIncVat(3.99)


//Task 1 - make a method with 2 integers and returns a string
//use if else statement inside method and operators within that else,else if too
//Where have I told it where input 1 and input 2 is?? //I ran it and put nothing in the getBIgVal ( , )
def getBigVal (input1: Int, input2: Int): String = {
  if (input1 > input2){
    "first"
  } else if (input1 < input2) {
    "second"
  } else if (input1 == input2) {
    "equal"
  } else {
    "oops we have an issue..."
  }
}
//run it
getBigVal(3,7)
getBigVal(6,4)
getBigVal(4,4)

///OR AS I coded:
def getBigVal (input1: Int, input2: Int): String = {
  if (input1 > input2) "first"
  else if (input1 < input2) "second"
  else
    "equal"
}
getBigVal(3,7)
getBigVal(6,4)
getBigVal(4,4)
//Task 2
//Create a method called ‘nameLength’ that takes in two Strings called firstName and surname and returns an Integer.
//The result of the method should return the length/size of the name which is greater.
// If both names are the same length return 0.
//Here is some test data eg First name: Peter Last nam: Pan, Result: 6,
// First name: Mickey Last nam: Mouse, Result: 9, etc

def nameLength(firstName: String, surname: String): Int = {

  if(firstName.length > surname.length){
    firstName.length
  } else if (firstName.length < surname.length){
    surname.length
  } else {
    0
  }
}

nameLength("Peter", "Pan")
nameLength("Mickey", "Mouse")
nameLength("Bigdonald", "Duck")
//OR
def nameLength(firstName: String, surname: String): Int = {
  val firstNameLength: Int = firstName.length
  val surnameLength: Int = surname.length

  if (firstNameLength > surnameLength) firstNameLength

  else if (firstNameLength< surnameLength) surnameLength
  else 0
}


/** Referenctial transparancy   */
//simply means a functions returns value is based solely on the inputs
//Is it easier for our brains to read the number or read the method again and again
//We say something has referential transparency when a functions return value is based solely on the inputs
//e.g. addition (1,2) always = 3
  //what is simpler for our brains?
def addTwoInts (x:Int, y:Int): Int = x + y
3 + 3
3 + addTwoInts (1,2)
addTwoInts (1,2) + addTwoInts (1,2)
6//just something to think about when writing more complex code. what is simpler for our brains.