package codingbat.warmup2

/*
    Warmup-2 stringTimes
    Given a string and a non-negative int n
    return a larger string that is n copies of the original string
 */

fun main(){
    println(stringTimes("Hi", 2))
    println(stringTimes("Hi", 3))
    println(stringTimes("Hi", 1))
}

fun stringTimes(str : String, times : Int) : String {
    var strTimes = str
    for(i in 1 until times){
        strTimes += str
    }
    return strTimes
}