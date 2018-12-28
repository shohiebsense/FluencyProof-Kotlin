package dslpractice


fun main(){
    val person = person{
        it.name = "John"
        it.age = 24
    }


    val person2 = personLambdaOnReceiver2 {
        name = "John"
        age = 22
    }

    val person3 = personLambdaOnReceiver {
        name = "Ai"
        age = 24
    }

    val person4 = personLambdaOnReceiver2{
        name = "John"
        age = 5
        address {
            street = "Jalan Melati"
            number = 222
            city = "London"
        }
    }




}


fun person(block : (Person) -> Unit) : Person {
    val p = Person()
    block(p)
    return p
}


//execute the lambda on the receiver instead of providing it as an argument.
fun personLambdaOnReceiver(block : Person.() -> Unit) : Person {
    val p = Person()
    p.block()
    return p
}

//the simpler one
fun personLambdaOnReceiver2(block : Person.() -> Unit) : Person =
        Person().apply(block)

//extending person
fun Person.address(block: Address.() -> Unit){
    address = Address().apply(block)
}

data class Person(var name : String? = null,
                  var age : Int? = null,
                  var address : Address? = null
)

data class Address(var street: String? = null,
                   var number: Int? = null,
                   var city: String? = null
)


