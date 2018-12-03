package codingbat

import kotlin.math.abs

/*
    Given an int n, return the absolute difference between n and 21, except return
    double the absolute difference if n is over 21
 */

fun main(args : Array<String>){
    diff21(19)
    diff21(10)
    diff21(21)
}

fun diff21(n : Int){
    if(n <= 21)
    println(abs( 21 - n))
    else{
        println(abs(abs((21- n) *2)))
    }
}