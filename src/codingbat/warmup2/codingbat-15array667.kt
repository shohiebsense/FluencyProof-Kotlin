package codingbat.warmup2

/*
    Given an array of ints,
    return the number of times that two 6's are next to each other
    in the array
    Also count instance where the second "6"
    is actually a 7
 */

fun main(args : Array<String>){
    println(array667(arrayListOf(6,6,2)))
    println(array667(arrayListOf(6,6,2,6)))
    println(array667(arrayListOf(6,7,2,6)))
}

fun array667(arrayList: ArrayList<Int>) : Int {
    var count = 0
    for(i in 1 .. arrayList.lastIndex){
        if((isEqualSix(arrayList[i-1]) && isEqualSixOrSeven(arrayList[i]) )){
            count++
        }
    }
    return count
}

fun isEqualSix(number : Int) : Boolean {
    return number == 6
}

fun isEqualSixOrSeven(number :Int) : Boolean{
    return number == 6 || number == 7
}

