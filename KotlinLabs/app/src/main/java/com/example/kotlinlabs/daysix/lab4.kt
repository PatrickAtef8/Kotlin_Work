package com.example.kotlinlabs.daysix

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun sumArray(arr: IntArray): Int {
    var sum = 0
    for (num in arr) {
        sum += num
        delay(100)
    }
    return sum
}


fun main() {
    runBlocking {
        val array = intArrayOf(1, 2, 3, 4, 5)
        val result = sumArray(array)
        println("Sum of array: $result")
    }
}

