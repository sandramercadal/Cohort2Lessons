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
val tripledSeq : Seq [Int] = firstSeq.map {
  number => number *3
}

//wrap in a case
//key remains the same word as key tripledMap: Map [String, Int] = firstMap.map {
//Come back to this
 val case (key, value) => (key, value *3)
}

val tripledMap : Map[String, Int] = firstMap.map {
  case (key, value) =>
  number => number *3
}

val changeKey:  Map [String, Int] = firstMap.map {
  case (key,value) => (key.capitalize, value)
}
val changeKeyAndValue:  Map [String, Int] = firstMap.map {
  case (key,value) => (key.capitalize, value *3)
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
val existsSeq: Boolean = firstSeq.exists(number => number >= 2)
//there is at least one result will get true
val existsSList: Boolean = firstList.exists(number => number >= 2)

val existsMap: Boolean = firstMap.exists (number => number._2 >= 2)

//CONTAINS - give it a specific piece of data to look fore.g do you contain a 2 or 7
//we are looking for one thing

val containsSequence: Boolen = filteredSeq.contains (2)
//true we we know it contains a 2
val containsList: Boolen = filteredSeq.contains (7)
//false we know it doesn't contain a 7

val containsMap: Boolean  = firstMap.contains ("two")
//checks key not the value!!

val containsOrSeq: Boolean = filteredSeq.contains (7) || firstSeq.contains (2)
//does it contain a 7 or  2, ONLY One needs ot be true to give true
//Combine the operators you already know


//ADDING TO START (Prepend) AND END OF A LIST (append)
//Scala like immutable objects so I can't start with and empty list

val x = Seq [Int] ()
x = x :+ 1 //Adds 1 to my list was empty before
x= x :+ 2 //This list now has 2, where did 1 go? This won't work.
//x - This wont work
// We make a new var every time :

val y: Seq  [Int] = Seq (3,4,5)
//Append (add to end)
val appendY = y:+ 6

//Prepend (add to start)
val prependY = 2 +: appendY
//How to aooend more than one thing
val multipleInts = Seq (0,1,2,3) ++ y
val multipleInts = Seq (0,1,2,3) +: y //this doesn't flatten it out

//APPEND TO A MAP
val appendMap = firstMap + ("six" -> 6)

//Map instead of ListMap to order the results of a map, use listMpa rather than Map

/**DELETIONS */
val removeHead = firstSeq.tail //remove the head
val removelast = firstSeq.init //remove last index position
//When your list hits an empty list you want to divert it not stop code

//Removing from a Map
val removeValueInMap = firstMap - "three" //call to the key to remove
val removeMultipleValueInMap = firstMap - ("three", "One") //call to the keys to remove

