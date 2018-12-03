package codingbat

/*
    Given two non-negative int values, return true if they have
    the same last digit, such as
    with 27 and 57. Note that the % "mod" operator computes remainders,
    so 17% 10 is 7
 */

fun main(args : Array<String>){
    println(lastDigit(7,17))
    println(lastDigit(6,17))
    println(lastDigit(3,113))
}

fun lastDigit(a : Int, b : Int) : Boolean {
    if (a < 0 || b < 0) return false
    return a % 10 == b % 10
}