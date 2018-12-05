package codingbat.warmup2

/*
    Given a string, return a version where all the "x" have been
    removed. Except an "x" at the very start
    or end should not be removed.
 */

fun main(args : Array<String>){
    println(stringX("xxHxix"))
    println(stringX("abxxxcd"))
    println(stringX("xabxxxcdx"))
}

fun stringX(str : String) : String{
    if(str.length < 2) return str
    var first = str[0]
    var last = str[str.lastIndex]
    var subsTr = str.substring(1,str.length-1)
    var newStr = subsTr.replace("x","",true)
    return first+newStr+last
}