package codingbat.string1

/*
    Given two strings, a and b
    return the result of putting them together
    in the order abba
    e.g "Hi" and "Bye" returns "HiByeByeHi"
 */

fun main(args : Array<String>){
    println(makeAbba("Hi","Bye"))
    println(makeAbba("Yo","Alice"))
    println(makeAbba("What","Up"))
}

fun makeAbba(firstStr : String, secondStr : String): String{
    return "$firstStr$secondStr$secondStr$firstStr"
}