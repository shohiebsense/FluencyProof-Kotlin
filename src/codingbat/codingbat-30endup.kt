package codingbat

/*
    Given a string, return a new string where the last 3 chars
    are now in upper case. If the string has less than 3 chars
    uppercase whatever is there. Note that str.toUpperCase()
    returns the uppercase version of a string
 */

fun main(args : Array<String>){
    println(endUp("Hello"))
    println(endUp("hi there"))
    println(endUp("hi"))
}

fun endUp(str : String) : String {
    println("Hello".indexOf("Hello".first()))
    if(str.length > 3){
        return str.replace(str,str.substring(0,str.lastIndex-2)+str.substring(str.lastIndex-2,str.lastIndex+1).toUpperCase())
    }
    return str.toUpperCase()
}

