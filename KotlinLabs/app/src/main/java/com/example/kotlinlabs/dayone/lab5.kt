package com.example.kotlinlabs.dayone

fun main() {
    print("Enter your first name: ")
    var firstName = readLine()
    if (firstName.isNullOrEmpty()) {
        firstName = "Anonymous"
        println(firstName)

    }

    print("Enter your last name: ")
    var lastName = readLine()
    if (lastName.isNullOrEmpty()) {
        lastName = "Anonymous"
        println(lastName)
    }

    val fullName = "$firstName $lastName"
    println("Full name: $fullName")
}
