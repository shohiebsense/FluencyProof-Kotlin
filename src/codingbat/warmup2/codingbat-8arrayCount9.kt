package codingbat.warmup2

/*
    Guveb an array of ints, return the number of 9's in the array
 */


fun main(args : Array<String>){
    println(arrayCount(arrayListOf(1,2,9)))
    println(arrayCount(arrayListOf(1,9,9)))
    println(arrayCount(arrayListOf(1,9,9,3,9)))
}

fun arrayCount(arrayList: ArrayList<Int>) : Int{
    var count = 0
    for(i in 0 .. arrayList.lastIndex){
        if(is9(arrayList[i]))    {
            count++
        }
    }
    return count
}

fun is9(number : Int) : Boolean{
    return number == 9
}