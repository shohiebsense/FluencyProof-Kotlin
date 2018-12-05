package codingbat.warmup1

/*
    We have a loud talking parrot. The "hour" parameter is the current hour time
    in range 0 .. 23. We are in trouble if the parrot is talking and the hour is before 7
    or after 20.
    Return true if we are in trouble.

 */

fun main(args : Array<String>){
    parrotTrouble(true, 6)
    parrotTrouble(true, 7)
    parrotTrouble(false, 6)
}

fun parrotTrouble(isTalking : Boolean, hour: Int){
    println(isTroubled(isTalking, hour))
}

fun isTroubled(isTalking : Boolean, hour: Int) : Boolean {
    return isTalking && (hour < 7 || hour > 20)
}