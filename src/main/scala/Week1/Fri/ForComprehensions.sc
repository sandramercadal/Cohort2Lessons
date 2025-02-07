//for comprehensions
//lightweight notation for a sequence pf methods in one go
//sometimes we don't want to call 6 methods to get to the end point
//only work on the collection from yesterday eg monadic types not on INT or strings

//<- short hand way for built in methods backwards arrow simple way of writing a function. End with word yield
//(flatmap, filter, map, foreach)
//These work on monadic types incl. sequences, list, option, either, future, etc
//will not work on standards Int and Strings & Boolean (workaround is to wrap in an option)
//yield -- call the map

//imagine we have to validate a password, does it match xyz, does it have an uppercase etc etc so lots of methods)

//CLASSIC
//wrap in methods so we can call them. Key word is 'for'
//giving me a list
def retrieveNumbers: Seq[Int] = for (number <- 1  to 10) yield number
retrieveNumbers
// (1 to 10 ).foreach (number => println (number))

//use operators
//squaring it
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
squaredNumbers

 //if guards
//list of numbers from 1 to 10 but if odd I don't want this printed
//best way is to use modulars of 2
//if within the parenthesis.
def useIfGuard: Seq [Int] = for (number <-1 to 10 if number % 2 == 0 ) yield number
useIfGuard
//removing odd ones

val animals: List [String] = List ("Peacock", "Dog", "Hamster", "Cat")//manipulate this list using a method
//lower case map here
//add and 'S' to the end of every animal
def addS (animalList:List [String]): List [String] = animalList.map(animal => animal + "s")
addS (animals)

//Lets lowercase them now
//=> means we want you to do something
def lowerCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.toLowerCase)
//makes the animals lowercase
lowerCaseAnimals(animals)

//what if I want lowercase and adding an S?? - full comprehensions allows us to do this
//{ doing a number of things } use curlies
def lowerCaseAndAddS (animalList:List [String]): List [String] = for {
  addAnS <- addS (animalList)
  lowerCase <- lowerCaseAnimals (List(addAnS))
} yield lowerCase
lowerCaseAndAddS(animals)

//you just want it as a list of strings you dont wnat this wrapped anymore
lowerCaseAndAddS(animals) //gives a list
lowerCaseAndAddS(animals).flatten //gives spaces between letters

lowerCaseAnimals(animals).mkString(" ")//change a list to a string

//capitaliseList(animals).map(name => name + "!").mkString(" ")
//make into a capital deosn't seem to run

lowerCaseAnimals(animals)

//Task 1a animal list we already made
//task 1b Use animal list and and return only the first letter capitalise
def upperCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.capitalize)
//makes the animals lowercase
upperCaseAnimals(animals)

//Taskk 1b & C (Unsure on these - Answers from April)
// Write a simple method that will take in list of names and return them with only the first letter capitalised.
//Run both methods using this list:
//                               val names: List [String] = List ("aRia", "BaRT", "ChUCk")
val names: List[String] = List("aRIa", "BaRT", "ChUCk")

def lowercaseNames(nameInput: List[String]):List[String] = nameInput.map(name => name.toLowerCase)
def capitaliseNames(nameInput: List[String]):List[String] = nameInput.map(name => name.capitalize)

// TASK 2
def capitaliseList(nameInput: List[String]): List[String] =
  for {
    lower <- lowercaseNames(nameInput) //apply the lower case method
    capital <- capitaliseNames(List(lower)) //apply the capitalize method
  } yield capital

capitaliseList(names).map(name => name + "!").mkString(" ")