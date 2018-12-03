package codingbat

import java.util.function.Predicate

/*
    Return true if the given string contains between 1 and 3
    'e' chars
 */

fun main(args : Array<String>){
    println(stringE("Hello"))
    println(stringE("Heelle"))
    println(stringE("Heelele"))
}

fun stringE(str : String) : Boolean{
    var count = 0
    for( c : Char in "e"){
        count += str.filter { s -> s == c }.count()
    }
    return count in 1 .. 3
}