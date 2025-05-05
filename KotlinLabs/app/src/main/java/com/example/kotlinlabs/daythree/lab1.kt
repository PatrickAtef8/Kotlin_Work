package com.example.kotlinlabs.daythree

data class Person(val name: String, val address: Address) {

    data class Address(val streetName: String, val city: String, val building: Building)
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
    val address = Person.Address(streetName, city, building)
    val person = Person(name, address)
    println(person.toString())
}