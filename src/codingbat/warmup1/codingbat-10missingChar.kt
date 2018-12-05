package codingbat.warmup1

/*
    Given a non-empty string and an int n, return a new string where the char
    at index n has been removed. The value of n will be a valid index of a char in
    the original string (i.e n will be in the range 0 .. st.length()-1 inclusive)
 */

fun main(args : Array<String>){
    println(missingChar("kitten", 1))
    println(missingChar("kitten", 0))
    println(missingChar("kitten", 4))
}

fun missingChar(string : String, index : Int) : String{
    var newString = string.removeRange(IntRange(index,index))
    return newString
}
