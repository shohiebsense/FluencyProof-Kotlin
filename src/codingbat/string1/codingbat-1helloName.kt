package codingbat.string1

/*
    Given a string name, e.g. "Bob", treturn a greeting of
    the form "Hello Bob!"
 */

fun main(args : Array<String>){
    println(helloName("Bob"))
    println(helloName("Alice"))
    println(helloName("X"))
}

fun helloName(str : String) : String{
    return "Hello $str!"
}