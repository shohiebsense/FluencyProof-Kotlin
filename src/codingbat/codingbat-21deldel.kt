package codingbat

/*
    Given a string, if the string "del" appears starting at index 1
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged
 */

fun main(args : Array<String>){
    println(delDel("adelbc"))
    println(delDel("adelHello"))
    println(delDel("adedbc"))
}

fun delDel(str : String) : String {
    if(str.contains("del",true)){
        return str.replace("del","")
    }
    return str
}