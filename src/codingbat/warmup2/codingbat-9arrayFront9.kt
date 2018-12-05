package codingbat.warmup2

/*
    Given an array of ints, return true if one of the first elements in
    the array is a 9.
    The array length may be less than 4
 */

fun main(args : Array<String>){
    println(arrayFront9(arrayListOf(1,2,9,3,4)))
    println(arrayFront9(arrayListOf(1,2,3,4,9)))
    println(arrayFront9(arrayListOf(1,2,3,4,5)))
}

fun arrayFront9(arrayList: ArrayList<Int>) : Boolean{
    if(arrayList.size < 4){
        if(arrayList.contains(9)) return true
    }
    var subList = arrayList.subList(0,3)
    if(subList.contains(9)) return true
    return false
}