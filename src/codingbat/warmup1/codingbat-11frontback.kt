package codingbat.warmup1

import java.lang.StringBuilder

/*
    Given a string, return a new sting where the first and lastchars
    have been exchanged
 */

fun main(args : Array<String>){
    println(frontBackUsingStringBuilder("code"))
    println(frontBack("a"))
    println(frontBackUsingStringBuilder("ab"))
}

fun frontBack(str : String) : String{
    var front = str[0]
    var back = str[str.lastIndex]
    var replaceFront = str.replaceRange(0,1,back.toString())
    var replaceBack = replaceFront.replaceRange(replaceFront.lastIndex,replaceFront.lastIndex,front.toString())

    return replaceBack.substring(0,replaceBack.lastIndex)
}

fun frontBackUsingStringBuilder(str : String) : String {
    if(str.length <= 1) return str
    var builder = StringBuilder(str)
    var front = builder[0]
    builder.deleteCharAt(0)
    builder.insert(0,builder.last())
    builder.deleteCharAt(builder.lastIndex)
    builder.append(front)
    return builder.toString()
}