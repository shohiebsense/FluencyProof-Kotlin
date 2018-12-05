package codingbat.warmup2

/*
    Given a string, return the count of the number of times that a string length 2
    appears in the string and also as the last 2 chars of the string,
    so "hixxxhi" yields 1 (we won't count the end substring
 */

fun main(args : Array<String>){
    println(last2("hixxhi"))
    println(last2("xaxxaxaxx"))
    println(last2("axxxaaxx"))
}

fun last2(str : String): Int {
    if(str.length < 2) return 0
    var last2 = getLast2(str)
    var j = 0
    var count = 0
    for(i in 1 .. str.length-2){
        var subsSample = str[j]+str[i].toString()
        if(subsSample.equals(last2,true)) count++

        j++
    }
    return count
}

fun getLast2(str : String) : String{
    return str.substring(str.length-2,str.length)
}