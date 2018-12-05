package codingbat.warmup1

/*
    Given two temperatures, return true if one is less than 0
    and the other is greater tha 100
 */

fun main(sargs : Array<String>){
    println(icyHot(120, -1))
    println(icyHot(-1, 120))
    println(icyHot(2, 120))
}

fun icyHot(firstNumber : Int, lastNumber :  Int): Boolean{
    return ((firstNumber < 0 && lastNumber > 100) || (firstNumber > 100 && lastNumber < 0))
}