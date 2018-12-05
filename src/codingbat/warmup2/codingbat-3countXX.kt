package codingbat.warmup2

/*
    Count the number of "xx" in the given string. We'll say that overlapping
    is allowed, so "xxx" contains 2 "xx"
 */

fun main(args : Array<String>){
    println(countXX("abcxx"))
    println(countXX("xxx"))
    println(countXX("xxxx"))
}

fun countXX(str : String) : Int {
    var firstX = ""
    var secondX = ""
    if(str.length < 2) return 0
    var j = 0
    var count = 0
    for(i in 1 .. str.lastIndex){
        secondX = str[i].toString()
        if(isX(secondX)){
            firstX = str[j].toString()
            if(isX(firstX)){
                count ++
            }
        }
        j++
    }
    return count
}

fun isX(char : String) : Boolean{
    return char.equals("x",true)
}