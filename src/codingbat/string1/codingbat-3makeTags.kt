package codingbat.string1

/*
    The web is built with HTML strings like "<i>Yay</i>" which
    draws Yay as italic text. In this example,
    the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and wod strings, create HTML string with tags
    around the word, e.g. "<i>Yay</i?"
 */

fun main(args : Array<String>){
    println(makeTags("i","Yay"))
    println(makeTags("i","Hello"))
    println(makeTags("cite","yay"))
}

fun makeTags(tag : String, word : String) : String{
    return "<$tag>$word</$tag>"
}