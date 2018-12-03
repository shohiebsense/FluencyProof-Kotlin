package codingbat

/*
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number
 */

fun main(args : Array<String>){
    println(nearHundred(93))
    println(nearHundred(90))
    println(nearHundred(89))
}

fun nearHundred(n : Int) : Boolean{
    return ((Math.abs(n) in 90..100) || (Math.abs(n) in 190 .. 200))
}