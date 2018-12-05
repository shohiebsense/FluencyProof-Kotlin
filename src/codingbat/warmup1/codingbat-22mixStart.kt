package codingbat.warmup1

/*
    Return true if the given string begins with
    "mix" except the 'm' can be anything, so "pix", "9ix"
    .. all count
 */

fun main(args : Array<String>){
    println(mixStart("mix snacks"))
    println(mixStart("pix snacks"))
    println(mixStart("piz snacks"))
}

fun mixStart(str : String) : Boolean {
    return str.contains("ix",true)
}