package dslpractice



fun main(args : Array<String>){
    val str2 = buildString2 {
        it.append("Hello")
        it.append(" ")
        it.append("World")
    }

    val str = buildString {
        this.append("Hello")
        append(" ")
        append("World")
    }

    println(str)
    println(str2)

    dependencies {
        it.compile("shohieb")
        it.testCompile("ahmad")
    }

    dependencies2 {
        compile("")
        testCompile("yooo")
    }

    println("Shohieb".lastChar())
    println("Kotlin".lastChar())


}

fun buildString2(action : (StringBuilder) -> Unit): String {
    val ab = StringBuilder()
    action(ab)
    return ab.toString()
}

//It's different in sense of way we invoke

fun buildString(action: StringBuilder.() -> Unit) : String {
    val sb = StringBuilder()
    sb.action()
    return sb.toString()
}

fun dependencies(action: (DependencyHandler) -> Unit) : DependencyHandler{
    val dependencies = DependencyHandler()
    action(dependencies)
    return dependencies
}

fun dependencies2(action: (DependencyHandler).() -> Unit) : DependencyHandler {
    val dependencies = DependencyHandler()
    dependencies.action()
    return dependencies
}

class DependencyHandler {
    fun compile(coordinate : String){

    }

    fun testCompile(coordinate : String){

    }
}


fun String.lastChar(): Char =
        this.toCharArray().get(this.length-1)

