package codingbat.warmup1

/*
    Given 2 int values, return true if one is negative and one is positive.
    Excecpt if the parameter "negative" is true, then return true
    only if both are negative
 */

fun main(args : Array<String>){
    println(posNeg(1, -1, false))
    println(posNeg(-1, 1, false))
    println(posNeg(-4, -5, true))

}

fun posNeg(firstNumber : Int, secondNumber : Int, negative : Boolean) : Boolean{
    return ((firstNumber < 0 && secondNumber > 0) || (firstNumber > 0 && secondNumber < 0)) ||
            (firstNumber < 0 && secondNumber < 0 && negative)
}