package codingbat.warmup2

/*
    Given a string, return a string made of the chars at indexes
    0,1,4,5,8,9 so "kittens" yields "kiens"
 */

fun main(args : Array<String>){
    println(altPairs("kitten"))
    println(altPairs("Chocolate"))
    println(altPairs("Chocolatee"))
    println(altPairs("Chocolateejjj"))
    println(altPairs("CodingHorror"))
}

fun altPairs(str : String) : String{
    if(str.length < 3) return str
    if(str.length < 4) {
        var newSter = str.removeRange(2,3)
        return newSter
    }
    var subsVar = str.substring(IntRange(0,1))
    var strVar = str.toCharArray()
    var j = 4
    for(i in 5 .. str.lastIndex step 4){
        var newVar = str.substring(IntRange(j,i))
        subsVar += newVar
        j+=4
    }
    if(j <= str.lastIndex){
        var newVar = str.substring(IntRange(j,str.lastIndex))
        subsVar += newVar
    }
    return subsVar
}