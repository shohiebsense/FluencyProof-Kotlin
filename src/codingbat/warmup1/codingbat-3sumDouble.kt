package codingbat.warmup1

/*  Given two int values, return their sum. Unless the two values are the same,
    then return double their sum
 */

fun main(args : Array<String>){
    println(sumDouble(1, 2))
    println(sumDouble(3, 2))
    println(sumDouble(2, 2))
}

fun sumDouble(firstNumber: Int, secondNumber: Int) : Int{
    if(isEqual(firstNumber, secondNumber)){
        return multiplyByDouble(firstNumber + secondNumber)
    }
    return firstNumber + secondNumber
}


fun isEqual(firstNumber : Int, secondNumber: Int)  : Boolean{
    return firstNumber == secondNumber
}

fun multiplyByDouble(sumNumber : Int) : Int{
    return sumNumber * 2
}