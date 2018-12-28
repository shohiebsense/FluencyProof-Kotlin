package dslpractice

import java.text.SimpleDateFormat
import java.util.*

@DslMarker
annotation class Dsl4


fun main(){
    val person = personNew {
        name = "John"
        dateOfBirth = "1980-12-01"
        address {
            street = "Main Street"
            number = 12
            city = "London"
        }
    }

    val personMulti = personNewMulti {
        name = "Johnn"
        dateOfBirth = "1980-12-01"
        address {
            street = "Sangkurinag"
            number = 12
            city = "Bandugn"
        }
        address {
            street = "Bogor"
            number = 1221
            city = "Kota Bogor"
        }

    }

    val personMulti2 = personNewMulti {
        name = "John"
        dateOfBirth = "1980-12-01"
        addresses2 {
            address {
                street = "Ahamd Yani"
                number = 222
                city = "London"
            }
            address {
                street = "Dev Avne"
                number = 12
                city = "Paris"
            }
        }
    }

    println(personMulti2.addresses[1].street)

}

@Dsl4
class ADDRESSES : ArrayList<AddressNew>(){

    fun address(block: AddressBuilder.()-> Unit){
        add(AddressBuilder().apply(block).build())
    }
}

@Dsl4
class AddressBuilder {
    var street =  ""
    var number = 0
    var city = ""

    fun build() : AddressNew = AddressNew(street, number, city)
}

fun personNew(block : PersonBuilder.() -> Unit) : PersonNew =
        PersonBuilder().apply(block).build()

fun personNewMulti(block : PersonMultiAddressBuilder.() -> Unit): PersonMultiAddress =
        PersonMultiAddressBuilder().apply(block).build()

@Dsl4
class PersonBuilder {
    var name: String = ""
    private var dob: Date = Date()
    var dateOfBirth : String = ""
    set(value){
        dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
    }

    private var address : AddressNew? = null
    fun address(block: AddressBuilder.() -> Unit){
        address = AddressBuilder().apply(block).build()
    }




    fun build() : PersonNew = PersonNew(name, dob, address)
}

@Dsl4
class PersonMultiAddressBuilder {
    var name: String = ""
    private var dob: Date = Date()
    var dateOfBirth : String = ""
        set(value){
            dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
        }

    private val addresses = mutableListOf<AddressNew>()
    fun address(block: AddressBuilder.() -> Unit){
        addresses.add(AddressBuilder().apply(block).build())
    }

    fun addresses2(block: ADDRESSES.() -> Unit){
        addresses.addAll(ADDRESSES().apply(block))
    }

    fun build() : PersonMultiAddress = PersonMultiAddress(name, dob, addresses)


}

data class PersonNew(val name : String,
                     val dateOfBirth : Date,
                     var address : AddressNew?
                     )

data class AddressNew(val street: String,
                   val number : Int,
                   val city: String
                   )

data class PersonMultiAddress(val name : String,
                              val dateOfBirth : Date,
                              var addresses : List<AddressNew>
                              )

