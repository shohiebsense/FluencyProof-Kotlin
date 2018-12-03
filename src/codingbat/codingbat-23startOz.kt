package codingbat

/*
    Given a string, return a string made of the first 2 chars
    (if present), however include first char only if it is 'o'
    and include the second only if it is 'z, so
    "ozymandias" yields "oz".
 */

fun main(args : Array<String>){
    println(startOz("ozymandias"))
    println(startOz("bzoo"))
    println(startOz("oxx"))
}

fun startOz(str : String) : String {
    var first2char = str.substring(0,2)
    if(first2char.contains("oz")){
        return first2char
    }
    if(first2char.contains("o")) return "o"
    if(first2char.contains("z")) return "z"
    return str
}