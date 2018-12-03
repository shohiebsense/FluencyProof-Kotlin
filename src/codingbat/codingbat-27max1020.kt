package codingbat

/*
    Given 2 positive int values, return the larger value
    that is in the range 10 .. 20 inclusive, or return 0
    if neither is in that range
 */

fun main(args : Array<String>){
    println(max1020(11,19))
    println(max1020(19,11))
    println(max1020(11,9))
    println(max1020(9,8))
}

fun max1020(a : Int, b : Int) : Int{
    if (a < 0 || b < 0) return 0
    if(a in 10 .. 20 || b in 10 .. 20){
        if (a > b) return a
        return b
    }
    return 0
}