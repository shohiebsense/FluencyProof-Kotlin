package dslpractice

/*
    Invoke
    being called on the instance of a Greeter class without method name.
 */


fun main(){
    val greeter = Greeter(greeting = "Welcome")
    greeter(name = "Kotlin")

    val dependencies = DependencyHandlerInvokeMode()
    dependencies{
        compile("")
        testCompile("")
    }

    //same as above
    /*dependencies.invoke {

  }*/
}


class Greeter(val greeting: String){
    operator fun invoke(name : String){
        println("$greeting $name")
    }
}


class DependencyHandlerInvokeMode {

    fun compile(coordinate: String){

        //add coordinate to some collection

    }

    fun testCompile(coordinate: String){

        //add coordinate to some collection

    }

    //Kotlin provides an interesting function called invoke,
    // which is an operator function. Specifying an invoke operator on a class allows
    // it to be called on any instances of the class without a method name.
    operator fun invoke(action: DependencyHandlerInvokeMode.() -> Unit): DependencyHandlerInvokeMode {
        this.action()
        return this

    }

}