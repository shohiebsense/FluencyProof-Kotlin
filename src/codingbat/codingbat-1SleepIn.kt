package codingbat

/*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true
    if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true
    if we sleep in.
 */

fun main(args : Array<String>){
    println(sleepIn(false,true))
    println(sleepIn(true,false))
    println(sleepIn(false,true))
}

fun sleepIn(weekDay : Boolean, vacation : Boolean) : Boolean{
    return !weekDay || vacation
}