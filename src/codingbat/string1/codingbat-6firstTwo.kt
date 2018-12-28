package codingbat.string1

/*
    Given a string, return the string made of its first two chars,
    so the string "Hello" yields "He"
    If the string is shorter than length 2,
    return whatever there is,
    so "X" yields "X" and the empty string "" yields
    the empty string "". Note that str.length() returns the length
    of a string
 */

fun main(args : Array<String>){
    println(firstTwo("Hello"))
    println(firstTwo("abcdefg"))
    println(firstTwo("ab"))
}

fun firstTwo(str : String) : String{
    if(str.length <= 2) return str
    return str.substring(0,2)
}