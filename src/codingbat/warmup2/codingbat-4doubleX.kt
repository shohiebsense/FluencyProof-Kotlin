package codingbat.warmup2

import com.sun.org.apache.xpath.internal.operations.Bool

/*
    Given a string, return true if the first instance of "x"
    in the string is immediately followed by another "x".
 */

fun main(){
    println(doubleX("axxbb"))
    println(doubleX("axax"))
    println(doubleX("xxxx"))
}

fun doubleX(str : String) : Boolean {
    if(str.length <= 1) return false
    var firstChar = ""
    var secondChar = ""
    var j = 0

    for(i in 1 .. str.lastIndex){
        firstChar = str[j].toString()
        if(isItX(firstChar)){
            secondChar = str[i].toString()
            if (isItX(secondChar)){
                return true
            }
        }
        j++
    }
    return false
}

fun isItX(str : String) : Boolean{
    return str.equals("x",true)
}