package com.example.kotlinlabs.dayfive

fun main() {
    fun calculate(num1: Double, num2: Double, operation: (Double, Double) -> Double): Double {
        return operation(num1, num2)
    }

    val add = { a: Double, b: Double -> a + b }
    val subtract = { a: Double, b: Double -> a - b }
    val multiply = { a: Double, b: Double -> a * b }
    val divide = { a: Double, b: Double -> a / b }

    println("5 + 3 = ${calculate(5.0, 3.0, add)}")
    println("5 - 3 = ${calculate(5.0, 3.0, subtract)}")
    println("5 × 3 = ${calculate(5.0, 3.0, multiply)}")
    println("6 ÷ 3 = ${calculate(6.0, 3.0, divide)}")
}