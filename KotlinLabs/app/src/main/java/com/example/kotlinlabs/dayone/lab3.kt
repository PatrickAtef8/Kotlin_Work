package com.example.kotlinlabs.dayone

fun main() {
    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter an operator: ")
    val operator = readLine()

    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    if(num2 == 0.0){
        print("Error division by zero")
        return
    }

    if (num1 == null || num2 == null) {
        println("Invalid number input.")
        return
    }

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("Invalid operator.")
            return
        }
    }

    println("Result: $result")
}
