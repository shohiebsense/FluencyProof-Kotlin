package codingbat.warmup2

/*
    Given a string, return a new string made of every other char starting with the first
    so "Hello" yields "Hlo"
 */

fun main(args : Array<String>){
    println(stringBits("Hello"))
    println(stringBits("Hi"))
    println(stringBits("Heeololeo"))
}

fun stringBits(str : String) : String {
    if(str.isEmpty()) return ""
    if(str.length <= 2) return str[0].toString()
    var j = 1
    var firstChar = ""
    var secondChar = ""
    var newwStr = str[0].toString()
    for(i in 2 .. str.lastIndex step 2){
        secondChar = str[i].toString()
        newwStr += secondChar
        j++
    }
    return newwStr
}

fun isNotSame(letterFirst : String, letterSecond : String) : Boolean{
    return !letterFirst.equals(letterSecond)
}