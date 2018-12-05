package codingbat.warmup2

/*
    given a string and a non-negative int n, we'll say that the front
    of the string is the first 3 chars,
    or whatever is there if the string is less than length 3.
    Return n copies of the front;

 */

fun main(){
    println(frontTimes("Chocolate",2))
    println(frontTimes("Chocolate",3))
    println(frontTimes("Abc",3))
    println(frontTimes("aB",2))

}

fun frontTimes(str : String, number : Int) : String{
    if(number < 0) return ""
    if(str.isEmpty()) return ""
    var strFrontTimes = ""
    if(str.length < 3){
        for(i in 1 .. number){
            strFrontTimes += str
        }
        return strFrontTimes
    }
    var substringFront3 = str.substring(0,3)
    for(i in 1 .. number){
        strFrontTimes += substringFront3
    }
    return strFrontTimes
}