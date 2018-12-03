package codingbat

/*
    Given 2 int values, return true if they are both in the range
    30 .. 40 inclusive, or they are both in the range
    40 .. 50 inclusive
 */

fun main(args : Array<String>){
    println(in3050(30,31))
    println(in3050(30,41))
    println(in3050(40,50))
}

fun in3050(a : Int, b : Int) : Boolean {
    return (a in 30 .. 40 && b in 30 .. 40) || (a in 40 .. 50 && b in 40 .. 50)
}