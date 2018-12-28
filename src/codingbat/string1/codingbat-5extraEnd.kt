package codingbat.string1

/*
    Given a string, return a new string made of 3 copies of the last 2 chars of the originial
    string. The string length will be at least 2.
 */


fun main(args : Array<String>){
    println(extraEnd("Hello"))
    println(extraEnd("ab"))
    println(extraEnd("Hi"))
}

fun extraEnd(str : String) : String{
    if(str.length <=2){
        return str+str+str
    }
    return str.substring(str.lastIndex -1, str.length)

}