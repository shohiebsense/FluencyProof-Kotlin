package codingbat
/*
    We'll say that a number is "teen" if it is in the range 13..19
    inclusive. Given 2 int values, return true if one or other
    is teen, but not both.
 */

fun main(args : Array<String>){
    println(loneTeen(13,99))
    println(loneTeen(21,19))
    println(loneTeen(13,13))
}

fun loneTeen(a : Int, b : Int) : Boolean {
    return  (a in 13 .. 19).xor(b in 13 .. 19)

}