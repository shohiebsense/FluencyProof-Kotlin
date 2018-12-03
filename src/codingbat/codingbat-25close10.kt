package codingbat

/*
    Given 2 int values, return whichever value is nearest to the value 10
    or return 0 in the event of a tie..
    Note that Math.abs(n) return the absolute value of a number
 */

fun main(argss : Array<String>){
    println(close10 (8,13))
    println(close10(13,8))
    println(close10(13,7))
}

fun close10(a : Int, b : Int) : Int {
    if(Math.abs(10-a) == Math.abs(10-b)) return 0
    if(Math.abs(10-a) < Math.abs(10-b)) return a
    return b
}