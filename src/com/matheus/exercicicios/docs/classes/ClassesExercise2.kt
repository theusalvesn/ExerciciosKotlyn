package com.matheus.exercicicios.docs.classes

import java.util.Locale.IsoCountryCode

/* Exercise 2
Declare the additional data classes that are needed for this code to compile.
 */
data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

data class Name(val firstName: String, val lastName: String)
data class Address(val streetAdress : String, val city : City)
data class City(val city: String , val countryCode: String )

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )

    println(person)
}
