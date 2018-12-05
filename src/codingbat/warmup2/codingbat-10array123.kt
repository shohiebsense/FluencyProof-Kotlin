package codingbat.warmup2

/*
    Given an array of ints, return true if the sequence of numbers
    1,2,3 appears in the array somewhere
 */

fun main(){
    println(array123(arrayListOf(1,1,2,3,1)))
    println(array123(arrayListOf(1,1,2,4,1)))
    println(array123(arrayListOf(1,1,2,1,2,3)))
}

fun array123(arrayList: ArrayList<Int>) : Boolean{
    var j = 0
    for(i in 3 .. arrayList.size){
        var subList = arrayList.subList(j,i)
        if(isSequence(subList)){
            return true
        }
        j++
    }
    return false
}

fun isSequence(arrayList: MutableList<Int>) : Boolean{
    return arrayList == mutableListOf(1,2,3)
}