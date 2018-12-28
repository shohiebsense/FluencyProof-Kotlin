package codingbat.string1

/*
    Given a string of even length, return the first half, so the string "WooHoo" yields "Woo".

 */

fun main(args : Array<String>){
    println(firstHalf("WooHoo"))
    println(firstHalf("HelloThere"))
    println(firstHalf("abcdef"))
}

fun firstHalf(str : String) : String {
    if ( str.length % 2 != 0)  return "not even"
    return str.substring(0,str.length / 2)
}