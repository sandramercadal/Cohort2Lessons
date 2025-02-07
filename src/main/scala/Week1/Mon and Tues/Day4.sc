import java.util.concurrent.RunnableScheduledFuture

/**
 * How do we store collections??
 */
// Seq, List, Map (Notice the uppercase)

//Immutable
//Most common are : Maps, Sequences & Lists

//SEQUENCES

//We are going to store in a val we don't necessarily need to
//these don't have keys:
val firstSeq: Seq [Int] = Seq (1,2,3,4,5)
val firstList: List [Int] = List (1,2,3,4,5)
//Anything we can do to a List we can do to a Seq

/**
 * MAP
 */
//Map has key value pairs (key -> value) declare both key and value in the parameters
val firstMap: Map [String, Int] = Map (
  //String        //Int
  "one"          -> 1,
  "two"          -> 2,
  "three"        -> 3,
  "Four"         -> 4,
  "Five"         -> 5
)

/**Accessing data from within a sequence */
val getSequenceData: Int = firstSeq (0)
val getSequenceHead: Int = firstSeq.head //index position 0
val getSequenceTail: Seq[Int] = firstSeq.tail //Gives everything
//except the head which the index position 0)

//val getSequence2Data: Int = firstSeq (2)
//val getTooMuchData: Int = firstSeq (12)//we don't have any data in the 12th index position
//error is IndexOutofbounds exception

//LISTS

val getList1Data: Int = firstList (1)
val getListTail: List [Int] = firstList.tail
val getLastInList: Int = firstList.last


//MAP
val getMapData = firstMap ("three")//enter the key to get the value

/** Manipulating data - using map */
val tripledList : List [Int] = firstList.map {
  number => number *3
}

val tripledSeq: Seq[Int] = firstSeq.map{
  _ * 3

}

/** Manipulating data - using map */
// name your data type - it is bad practice to not name your data type
//wrap in a case
//key remains the same word as key
val tripledList: List[Int] = firstList.map{
  number => number * 3
}
val tripledSeq: Seq[Int] = firstSeq.map{
  _ * 3
} // bad practice to not name your data type
val tripledMap: Map[String, Int] = firstMap.map {
  case (key, value) => (key, value * 3)
}
val changeKey: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value)
}
val changeKeyAndValue: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value *3)
}


/** Manipulating data - filtering */
//filter
//filterNot (works similar to are !=)

val filteredSeq: Seq [Int] = firstSeq.filter (
  number => number > 2
)

val filteredList: List [Int] = firstList.filter (
  number => number >= 2
)
val filteredList: List [Int] = tripledList.filter (
  number => number >= 2
)

filteredSeq == filteredList //returned true desoite the val names being the same we are checking
//for the resulting value

//Filter a map - diff to calling it case
val fileteredMap: Map [String, Int] = firstMap.filter(
  number => number._2 >= 2
)
//Extra step to filter maps:
// _1 to access the key
//_2 to access value

//Filter not: find everything that is not this
val filterNotList: List [Int] = firstList.filterNot(
  number => number >= 2
)

val filtereredList: List [Int] = firstList.filter((
  number => !(number >= 2)
))

//Checking if anything is there
val filterNotAlternativeList : List [Int]
= firstList.filter(
  number => !(number >=2)
)

/**Manipulating data - check if an element is present
 */
  //USING EXISTS
//Get a boolean result

 val existsSeq: Boolean = firstSeq.exists(number => number >= 7)//there is at least one result will get true
 val existsList: Boolean = firstList.exists(number => number >= 2)
 val existsMap: Boolean = firstMap.exists(number => number._2 >= 2)


 //CONTAINS - give it a specific piece of data to look fore.g do you contain a 2 or 7
 //we are looking for one thing
 val containsSeq: Boolean = filteredSeq.contains(2)//true we we know it contains a 2
 val containsList: Boolean = filteredList.contains(7)//false we know it doesn't contain a 7
 val containsMap: Boolean = firstMap.contains("two") //checks the keys not the value!
 val containsOrSeq: Boolean = filteredSeq.contains(7) || firstSeq.contains(2)
//does it contain a 7 or  2, ONLY One needs ot be true to give true
//Combine the operators you already know that we learnt

/**TASK 1*/
//1. Create a Seq of the names of everybody on the course
val names: Seq[String] = Seq("Scooby", "Shaggy", "Fred", "Velma", "Daphne")
//2. Create a Map of 1-“red”, 2-“yellow”, 3-“blue”, 4-“green” and play with accessing the elements
val colours: Map[Int, String] = Map(1 -> "red", 2 -> "yellow", 3 -> "blue", 4 -> "green")
val filteredForColourBlue: Map[Int, String] = colours.filter(num => num._1 == 3)
val filteredForColourBlueV2: Map[Int, String] = colours.filter(num => num._2 == "blue")
//3. Add 1 to all numbers in a collection.
val addOneSeq = firstList.map { number => number + 1 }
//4.Remove all even numbers from a collection.
val oddNumbersOnly = firstList.filter {
  number => number % 2 != 0
}
//could use filterNot == rather than !=
val oddNumbersOnlyFilterNot = firstList.filterNot {
  number => number % 2 == 0
}
//5. Return true if a Seq has a String that contains the letter “r” .
val containsLetterR = names.exists(name => name.contains("r"))
/**TASK 2*/
//1.We have looked at the Seq and Map iterables. We haven’t looked at Sets. What are they? How are they different?
//HastSet, SortedSet etc. Cannot contain duplicate elements (if we had two names the same for our names list, we wouldn't be able to use a set).
//2. flatMap is another cool method we can call on collections. Research what is does and when it could be useful. Write an example.
//Combo of map and flatten method. You can iterate through each item, apply a function and separate them (the inner grouping is removed). This is helpful in cases where you need to access data that is buried e.g. lists within lists.
val flatMapNames: Seq[Char] = names.flatMap(_.toCharArray) //print char
val flatMapNames: Seq[Char] = names.flatMap(_.toUpperCase) //can apply functions to each char
//returns a Seq[char] rather than strings
/** Making additions - prepend (start) or append (end) */
val x: Seq[Int] = Seq[Int]()
x :+ 1
x :+ 2
x //won't work = immutable
val y: Seq[Int] = Seq(3,4,5)
// Append (add to end)
val appendY = y:+ 6
// Prepend (add to start)
val prependY = 2 +: appendY
val multipleInts = Seq(0,1,2) +: y
val multipleInts = Seq(0,1,2) ++ y
//Append Map
val appendMap = firstMap + ("six" -> 6)
//To order use ListMap rather than Map.
/** Deleting */
val removeHead = firstSeq.tail //remove head
val removeLast = firstSeq.init //remove last index position
//Removing Map
val removeValueInMap = firstMap - "three" //call to the key
val removeMultipleValuesInMap = firstMap - ("three", "one") //call to the key