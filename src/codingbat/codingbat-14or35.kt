package codingbat

/*
    Return true if the given non-negative number is a multiple of 3 or a multiple
    of 5. Use the % "mod" operator
 */

fun main(args : Array<String>){
    println(or35(3))
    println(or35(10))
    println(or35(8))
}

fun or35(n : Int) : Boolean {
    if (n < 0) return false
    return (n % 3 == 0 || n % 5 == 0)
}