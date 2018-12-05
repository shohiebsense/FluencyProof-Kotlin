package codingbat.warmup2

import java.lang.StringBuilder

/*
    Given a non-empty string like "Code"
    return a string like "CCoCodCode"
 */


fun main(args : Array<String>){
    println(stringSplosion("Code"))
    println(stringSplosion("abc"))
    println(stringSplosion("ab"))
}

fun stringSplosion(str : String) : String{
    if(str.isEmpty()) return ""
    if(str.length <= 2) return str[0]+str.substring(0,str.length)
    var builder : StringBuilder = StringBuilder("")
    var j = 0
    for(i in 1 .. str.length){
        builder.append(str.substring(0,i))
    }
    return builder.toString()
}