package codingbat

/*
    Given three int values a b c, return the largest
 */

fun main(string : Array<String>){
    println(intMax(1,2,3))
    println(intMax(1,3,2))
    println(intMax(3,2,1))
}

fun intMax(a : Int, b : Int, c : Int) : Int{
    return arrayListOf(a,b,c).max()!!
}