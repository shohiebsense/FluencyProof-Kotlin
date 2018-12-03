package codingbat

import java.lang.StringBuilder

/*
    Given a string, take the last char and return a new string with the
    last char added at the front and back
    so "cat" yields "tcatt". The original string will be length 1 or more
 */

fun main(args : Array<String>){
    println(backAround("cat"))
    println(backAround("Hello"))
    println(backAround("a"))
}

fun backAround(str : String) : String{
    var lastChar = str.last()
    var strBuilder = StringBuilder(str)
    strBuilder.insert(0,lastChar)
    strBuilder.append(lastChar)
    return strBuilder.toString()
}