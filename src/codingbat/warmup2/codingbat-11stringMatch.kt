package codingbat.warmup2

/*
    Given 2 strings, a and b, return the number of the positions
    where they contain the same
    length 2 substring, so "xxcaazz" and "xxbaaz" yields 3
    since the "xx", "aa" and "az" substring appear
    in the same place in both strings
 */

fun main(args : Array<String>){
    println(stringMatch("xxcaazz","xxbaaz"))
    println(stringMatch("abc","abc"))
    println(stringMatch("abc","axc"))
}

fun stringMatch(firstString : String, secondString : String) : Int {
    if(firstString.length < 2 && secondString.length < 2) return 0
    var prevIIndex = 0
    var count = 0

    for(i in 1 .. firstString.lastIndex){
        var prevJindex = 0
        var subFirst = firstString[prevIIndex]+firstString[i].toString()
        for(j in 1 .. secondString.lastIndex){
            var subSecond = secondString[prevJindex]+secondString[j].toString()
            if(isSame(subFirst,subSecond)) count++
            prevJindex++
        }
        prevIIndex++
    }
    return count
}

fun isSame(first : String, second : String) : Boolean {
    return first.equals(second)
}