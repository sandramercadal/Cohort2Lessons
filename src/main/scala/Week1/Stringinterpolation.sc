/** string interpolation */


//S

val name : String = "Sandra"
println (s" My name is $name.")

println (s" 3 * 3 = ${3*3}")

val a: Int = 19764
val b:Int = 67
println (s" a x b = ${a * b}")
//Helpful when debugging code. Print the result at certain points in a method.

//f
//common format specifiers e.g typesafety in interpolation
// %f - float, Double
// %d - Int, Long
// %s - String

val height: Double = 1.9
println (f" $name%s is $height% .2f meters tall")
//.2f is to 2 decimal places


println (s" $name%s is $height% .2f meters tall") //with s interpolation instead of f it doesn't recognise formatting

math.Pi //built in library. some libraries you import some you do not.
//Pi is case sensitive

println (f" Pi to 2 decimal places is ${math.Pi}%.2f")
//This is Pi to 2 decima places i use %f because Pi is a double
println (f" Pi to 5 decimal places is ${math.Pi}%.5f")
//This is Pi to 5 decima places i use %f because Pi is a double
println (f" Pi to 3 decimal places is ${math.Pi}%.3f")
//This is Pi to 3 decima places i use %f because Pi is a double

//add padding in the sentence.
println (f" Pi to 3 decimal places is ${math.Pi}%20.1f")
//how to add padding after ...badly using speech marks...
println (f" Pi to 3 decimal places is ${math.Pi}%20.1f     '")


//Printf lets us do this a bit better and swap to using a string for ease
//you need to declare it at the start then have a placeholder
 printf ("'%s'", "hello")
printf ("'%20s'", "hello")//padding before
printf ("'%-20s'", "hello")//padding after
printf ("'%20s%-20s'", "hello", "") //Padding before and after
printf ("'%25s%-20s'", "hello", "") //Even Padding before and after

//raw
//new line with s
println (s"I'm going onto a \nnew line")
//the result is highlighted and when you click it everything will go onto a new line

//new line with raw seems to ignore any lines! won't see this very often
println (raw"I'm going onto a \nnew line")

//Common Use --> Regex. When we want something to look a certain way e.e password
//if you want a challenge look into this

//create twp strings with 2 names.print name A is older than B
//val name : String = "Molly"
//val secondName : String = "Mary"
//println (s" Molly is older than $secondName.")

//Create 2 ages for the people, and print A is x years older than B
val person1: String = "Molly"
val person2: String = "Mary"
val age1: Int =22
val age2: Int = 16
println (s "")
printf ("%s  Molly is 1 year older than $Mary.")

//Change your Int to doubles

//val : Double = 1.9
//println (f" $name%s is $height% .2f meters tall")
val height: Double = 1.2
println (f" $name%s is $height% .2f meters tall")
println (f" $secondName%s is $height% .2f meters tall")
//.2f is to 2 decimal places

//TASK - APRIL CODE
//Create 2 strings for two peoples names. Then using those names use string interpolation to print “A is older than B”
val personA:String = "Arnold"
val personB:String = "Bart"
println(s"$personA is older than $personB")

//Create 2 integers for the age of each person. Then use string interpolation to calculate how much older the first person is and print “A is X years older than B”
val wholeAgeA: Int = 35
val wholeAgeB: Int = 29
println(s"$personA is ${wholeAgeA - wholeAgeB} years older than $personB")

//Change your 2 integers to doubles and provide new decimal point values. Using string interpolation update the previous task so that the sentence remains the same but will give the answer to 1d.p.
val ageA: Double = 35.40
val ageB: Double = 29.30
println(f"$personA is ${ageA - ageB}%.1f years older than $personB")

//Use string interpolation to avoid the new lines from this string. “\n\n\n\n\n\n\n\nsameline\n\n”
println(raw"\n\n\n\n\n\n\n\nsameline\n\n")





