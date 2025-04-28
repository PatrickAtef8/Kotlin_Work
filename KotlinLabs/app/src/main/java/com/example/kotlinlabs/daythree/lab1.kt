package com.example.kotlinlabs.daythree


 class Person(val name: String, val address: Address) {


      class Address(
        val streetName: String, val city: String, val building: Building) {

         override fun toString(): String {
            return "$streetName, $city ${building.name}"
        }
    }

    override fun toString(): String {
        return "Person: $name\nAddress: $address"
    }
}

enum class Building {
    VILLA,
    APARTMENT
}


fun main() {

    val name = "Patrick Atef"
    val streetName = "El-Teraa El-Bolakia"
    val city = "Cairo/ShobraMasr"
    val building = Building.APARTMENT
    val address = Person.Address(streetName, city,building)
    val person = Person(name,address)
    println(person)
}