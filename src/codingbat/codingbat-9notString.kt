package codingbat

import java.lang.StringBuilder

/*
    Given a string, return a new string where "not" has been added to the front.
    However, if the string already begins with "not", return the string unchanged
    use .equals() to compare 2 string
 */

fun main(args : Array<String>){
    println(notString("candy"))
    println(notString("x"))
    println(notString("not bad"))
}

fun notString(str : String) : String{
    var stringBuilder : StringBuilder = StringBuilder(str)
    if (str.contains("not ",true)){
        return str
    }
    return stringBuilder.insert(0,"not").toString()
}