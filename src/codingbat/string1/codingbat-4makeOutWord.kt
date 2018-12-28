package codingbat.string1

/*
    Given an "out" string length 4, such as "<<>>" ad a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>"
    Note: Use str.substring(i,j) to extract he string starting at index  and going up to but not including index j
 */

fun main(args : Array<String>){
    println( makeOutWord("<<>>","Yay"))
    println(makeOutWord("<<>>","WooHoo"))
    println(makeOutWord("[[]]","word"))
}

fun makeOutWord(bracketString : String, word : String) : String{
    var frontBracket = bracketString.substring(0,2)
    var endBracket = bracketString.substring(bracketString.lastIndex-1,bracketString.lastIndex+1)

    return "$frontBracket$word$endBracket"

}