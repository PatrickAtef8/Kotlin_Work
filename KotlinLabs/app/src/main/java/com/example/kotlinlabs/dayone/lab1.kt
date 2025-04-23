package com.example.kotlinlabs.dayone

fun main() {

    while (true) {
        print("Please enter your name: ")
        val userName = readlnOrNull()
        val name = if (userName.isNullOrEmpty()) "Nothing" else userName
        val greeting = if (name == "Nothing") "Enter your name please" else "Hello, $name"
        println(greeting)
    }
}