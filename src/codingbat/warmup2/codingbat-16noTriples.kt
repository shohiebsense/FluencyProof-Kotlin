package codingbat.warmup2

/*
    Given an array of ints, we'll say that a triple is a value
    appearing 3 times in a row
    the array. Return true if the array does not contain
    any triples
 */

fun main(args : Array<String>){
    println(noTriples(arrayListOf(1,1,2,2,1)))
    println(noTriples( arrayListOf(1,1,2,2,2,1)))
    println(noTriples(arrayListOf(1,1,1,2,2,2,1)))
}

fun noTriples(arrayList: ArrayList<Int>): Boolean{
    var hasTriples = false
    if(arrayList.size < 3) return true
    for(i in 2 .. arrayList.lastIndex){
        hasTriples = isTriples(arrayList[i-2] ,arrayList[i-1],arrayList[i])
        if(hasTriples){
            return !hasTriples
        }
    }
    return !hasTriples
}

fun isTriples(firstNumber : Int, secondNumber : Int, thirdNumber : Int) : Boolean{
    return (firstNumber == secondNumber && secondNumber == thirdNumber)
}