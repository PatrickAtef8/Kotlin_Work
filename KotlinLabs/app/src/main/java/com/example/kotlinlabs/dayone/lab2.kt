package com.example.kotlinlabs.dayone

import java.util.Random

fun main() {
    val random = Random()
    val numbers = IntArray(100) {
        random.nextInt(100)
    }

    for (num in numbers) {
        if (num <= 10) {
            println(num)
        }
    }
    }
