package codingbat

/*
    Given a string, return true if the string starts with "hi" and false otherwise
 */

fun main(args : Array<String>){
    println(startHi("hi there"))
    println(startHi("hi"))
    println(startHi("hello hi"))
}

fun startHi(str : String) : Boolean {
    return str.startsWith("hi",true)
}