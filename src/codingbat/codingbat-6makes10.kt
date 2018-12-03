package codingbat

/*
    Given 2 ints, a and b. Return true if one of them is 10
    or if their sum is 10
 */

fun main(args : Array<String>){
    println(makes10(9,10))
    println(makes10(9,9))
    println(makes10(1,9))
}

fun makes10(a : Int, b : Int) : Boolean{
    return (a + b == 10 || ((a == 10 || b == 10)))
}