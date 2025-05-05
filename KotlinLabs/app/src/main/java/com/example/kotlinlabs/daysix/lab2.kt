package com.example.kotlinlabs.daysix

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking



suspend fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
        delay(100)
    }
    return result
}

fun main() {
    runBlocking {
        val number = 5
        val job = async {
            factorial(number)
        }
        val result = job.await()
        println("Factorial of $number is $result")
    }
}


