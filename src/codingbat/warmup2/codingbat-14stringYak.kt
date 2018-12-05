package codingbat.warmup2

/*
    Suppose the string "yak" is unlucky.
    Given a string, return a version where all the yak
    are removed, but the "a" can be any char/ The "yak"
    strings will not overlap
 */

fun main(args : Array<String>){
    println(stringYak("yakpak"))
    println( stringYak("pakyak"))
    println(stringYak("yak123ya"))
}

fun stringYak(str : String) : String{
    return str.replace("yak","")
}