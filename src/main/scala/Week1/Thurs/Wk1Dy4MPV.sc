//Must remember the capitals letters in Maps, Seq & List when you are matching it to a key or value

//Q1a Make a List of the numbers from 1-5
val numberList: List [Int] = List (1,2,3,4,5)

//Q1a part II Make a Seq of the primary colours
val primaryColours : Seq [String] =
  Seq ("red", "yellow", "blue")

//Q1b Write a function to multiply all the values in your List by 3
val tripleList: List[Int] = numberList.map{
  number => number * 3}

//Q1c Write a function that removes 'blue' from above primaryColours
//blue seems to be the tail
//remove with a tail function or removeLast?
//USer filter or filter not??
val removeLast = primaryColours.init


//Q1d Write a function that returns true if my 'primaryColours' contains Orange
//First I tried a boolen as I wanted a yes/no answer: something like:
// val existsList: Boolean = primaryColours.exists(string => string "orange")

val containsColourOrange = primaryColours.exists (name => name.contains("orange"))


//Q2 Write a function that maps each value in your List to true or false depending if they are odd.

//Ran out of time

//Q3 David has many pets; 2 dogs, 1 fish and 1 cat.
//Q3 a) Make a map which details the key -> value pair of "Name -> "Animal"
//At first I started out with a [String, Int] whereby 1= dog, 2 = fish, 3 = cat

val animalMap: Map[String, String] = Map(
  "Rufus" -> "dog",
  "Honey" -> "dog",
  "Olive" -> "fish",
  "Flossy" -> "cat"
)

//Q3 b) Write a function that returns a list of David's dogs.
//needs to return Rufus and Honey from a MAP[String, String] therefore if the 2nd String matches to "dog" return the 1st string value of "Rufus" and "Honey"

//ATTEMPTS
//val filterNotList: Map[String] = animalMap.filterNot(string => string != "fish" || "cat")
//val filteredDogNames: Map [String, String] = animalMap.filter( name, "dog") => dogNames )
//val filteredAnimalMap: Map[String, String] = animalMap.filter( string => string = "dog")

//val dogNames: Map [String] = animalMap.filter ( )
//val filteredAnimals: Map[String, Int] = animalMap.filter(
  //string => string._2 >= 2
//)
val filteredAnimalMap: Map[String, String] = animalMap.filter( string => string._2 == "dog")

//*APRILS CODE WITH CORRECT CODE
*/