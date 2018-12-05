package codingbat.warmup1

/*
    Given a string, we'll say that the front is the first 3 chars of the string
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front
 */

fun main(args : Array<String>){
    println(front3("Java"))
    println(front3("Chocolate"))
    println(front3("abc"))
    println(front3("ab"))
}

fun front3(str : String) : String{
    if(str.length <= 3){
        return str+str+str
    }
    var sub3 = str.substring(0,3)
    return sub3+sub3+sub3
}