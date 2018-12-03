package codingbat

/*
    Given a non-empty string and an int N, return the string made starting
    with char 0, and then every Nth char of the string.
    So if N is 3, use char 0,3,6 ... and so on.
    N is 1 or more
 */

fun main(){
    println(everyNth("Miracle",2))
    println(everyNth("abcdefg",2))
    println(everyNth("abcdefg",3))
}

fun everyNth(str : String, n : Int) : String{
    if(str.isEmpty()) return "empty"
    var char  = ""
    for(i in 0 .. str.lastIndex step n){
        char += str[i]
    }
    return char
}