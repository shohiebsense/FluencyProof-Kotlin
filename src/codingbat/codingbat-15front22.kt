package codingbat

/*
    Given a string, take the first 2 chars and return the string
    with the 2 chars added at both
    the front and back, so "kitten" yields "kikittenki"
    If the string length is less than 2, use whatever chars are there
 */

fun main(args : Array<String>){
    println(front22("kitten"))
    println(front22("Ha"))
    println(front22("abc"))
}

fun front22(str : String) : String {
    if(str.length < 2){
        return str+str+str
    }
    var substr = str.substring(0,2)
    return substr+str+substr
}