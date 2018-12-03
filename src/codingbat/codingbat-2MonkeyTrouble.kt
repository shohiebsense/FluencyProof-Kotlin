package codingbat
/*
    We have two monkeys, a and b and the parameters aSmile and bSmile indicate if each
    is smiling. We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.

*/


fun main(args : Array<String>){
    println(monkeyTrouble(true, true))
    println(monkeyTrouble(false, false))
    println(monkeyTrouble(true, false))
}

fun monkeyTrouble(aSmile : Boolean, bSmile : Boolean) : Boolean{
    return (aSmile && bSmile) || (!aSmile && !bSmile)
}