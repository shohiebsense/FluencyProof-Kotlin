package codingbat.warmup2

/*
    Given an array of ints
    return true if it contains a 2,7,1 pattern : a value
    followed by the value plus 5
    followed by the value minus 1
    Additionally the 271 ccounts even if the "1" differs by 2 or less
    from correct value
 */

fun main(args : Array<String>){
    println(has271( arrayListOf(1,2,7,1)))
    println(has271( arrayListOf(1,2,8,1)))
    println(has271( arrayListOf(2,7,1)))

}

fun has271(arrayList: ArrayList<Int>) : Boolean{
    var has271 = false
    if (arrayList.size < 3) return false
    for(i in 2 .. arrayList.lastIndex){
        has271 =  equals5(arrayList[i-2],arrayList[i-1]) && equals1(arrayList[i-1],arrayList[i])
        if(has271) return has271
    }
    return has271
}

fun equals5(firstNumber : Int, secondNumber : Int) : Boolean{
   // println("$firstNumber  $secondNumber  ${firstNumber + 5 == secondNumber}")
    return firstNumber + 5 == secondNumber
}

fun equals1(firstNumber: Int, secondNumber: Int) : Boolean{
    return  firstNumber - (firstNumber -1) == secondNumber
}